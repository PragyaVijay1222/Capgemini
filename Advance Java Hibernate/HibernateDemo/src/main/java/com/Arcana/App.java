package com.Arcana;

import com.Arcana.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class App {
	public static void createStudent(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Student student = new Student("Anu", 21);
			session.persist(student);
			transaction.commit();
			System.out.println("Student Saved");
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	
	public static void createStudentViaInput(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		sc.close();
		
		try {
			Student student = new Student(name, age);
			session.persist(student);
			transaction.commit();
			System.out.println("Student Saved");
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void getStudentById(SessionFactory factory) {
		Session session = factory.openSession();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.close();
		
		try {
			Student student = session.get(Student.class, id);
			if(student != null) {
				System.out.println(student);
			}
			else {
				System.out.println("Student not found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void fetchAllStudents(SessionFactory factory) {
		Session session = factory.openSession();
		
		try {
			List<Student> students = session.createQuery("from Student", Student.class).list();
			students.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void updateStudentById(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new name: ");
		String name = sc.nextLine();
		System.out.println("Enter the new age: ");
		int age = sc.nextInt();
		sc.close();
		
		try {
			Student student = session.get(Student.class, id);
			student.setName(name);
			student.setAge(age);
			session.merge(student);
			transaction.commit();
			System.out.println("Student's details changed");
		}catch(Exception e) {
			transaction.rollback();
			e.getStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void deleteStudentById(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.close();
		
		try {
			Student student = session.get(Student.class, id);
			if(student != null) {
				session.remove(student);
				transaction.commit();
				System.out.println("Student removed");
			}else {
				System.out.println("Student not found");
			}
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		createStudent(factory);
		
//		createStudentViaInput(factory);
//		getStudentById(factory);
//		fetchAllStudents(factory);
//		updateStudentById(factory);
//		deleteStudentById(factory);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation (1 for create, 2 for reading single row, 3 for reading all the data, 4 for Update, 5 for delete): ");
		
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
			createStudentViaInput(factory);
			break;
		case 2:
			getStudentById(factory);
			break;
		case 3:
			fetchAllStudents(factory);
			break;
		case 4:
			updateStudentById(factory);
			break;
		case 5:
			deleteStudentById(factory);
			break;
		default:
			System.out.println("Enter correct input.");
		}
		sc.close();
	}
}
