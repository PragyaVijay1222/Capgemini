package com.Arcana;

import org.hibernate.Session;
import net.sf.ehcache.hibernate.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session1 = HibernateUtil.getSessionFactory().openSession();
		Student s1 = session1.get(Student.class, 1);
		System.out.println(s1);
		session1.close();

		System.out.println("First session done");

		Session session2 = HibernateUtil.getSessionFactory().openSession();
		Student s2 = session2.get(Student.class, 1);
		System.out.println(s2);
		session2.close();

		System.out.println("Second session done");
	}
}
class Student{
	
}