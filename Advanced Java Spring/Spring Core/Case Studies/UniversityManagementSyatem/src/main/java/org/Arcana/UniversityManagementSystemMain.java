package org.Arcana;
import org.Arcana.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UniversityManagementSystemMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        try {
		System.out.print("Enter the department name: ");
		String departmentName = sc.nextLine();
		
		Departments department = new Departments(departmentName);
		
		System.out.println("Enter the student name: ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter the student ID Card Number: ");
		int studentIDCardNumber = sc.nextInt();
		sc.nextLine();
		
		Students student = new Students(studentName, department, studentIDCardNumber);
		department.addStudent(student);
		
		System.out.println("Enter 1st course: ");
		String courseName1 = sc.nextLine();
		System.out.println("Enter 2nd course: ");
		String courseName2 = sc.nextLine();
		
		Courses course1 = new Courses(courseName1);
		Courses course2 = new Courses(courseName2);
		
		student.addCourse(course1);
		student.addCourse(course2);
		
		session.persist(student);
		tx.commit();
		System.out.println(student);
		}
        catch(Exception e) {
        	tx.rollback();
        }
		session.close();
	}
}
