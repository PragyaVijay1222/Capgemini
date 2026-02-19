package manyToMany;

import manyToMany.entity.Student;
import manyToMany.entity.Subject;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        while (true) {

            System.out.println("\nChoose:");
            System.out.println("1. Add student with subjects");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Session session = factory.openSession();
                    Transaction tx = session.beginTransaction();

                    System.out.print("Enter student name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter number of subjects: ");
                    int count = sc.nextInt();
                    sc.nextLine();

                    Set<Subject> subjectSet = new HashSet<>();

                    for (int i = 0; i < count; i++) {

                        System.out.print("Enter subject name: ");
                        String subjectName = sc.nextLine();

                        Subject subject = session
                                .createQuery(
                                        "from Subject where name = :name",
                                        Subject.class)
                                .setParameter("name", subjectName)
                                .uniqueResult();

                        if (subject == null) {
                            subject = new Subject(subjectName);
                        }

                        subjectSet.add(subject); 
                    }

                    Student student = new Student(
                            studentName,
                            age,
                            new java.util.ArrayList<>(subjectSet)
                    );

                    session.persist(student); 
                    tx.commit();
                    session.close();

                    System.out.println("Student and subjects added successfully!");
                    break;

                case 2:
                    factory.close();
                    sc.close();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
