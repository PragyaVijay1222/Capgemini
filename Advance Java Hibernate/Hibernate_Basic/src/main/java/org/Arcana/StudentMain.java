package org.Arcana;

import org.Arcana.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	public static void main(String[] args) {
		
//		/////////////////////////////////////////////////
		
//		Inserting data
		
		
//		Student s1 = new Student();
//		s1.setsName("Pragya");
//		s1.setRollNo(101);
//		s1.setsAge(22);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.persist(s1);
//		tx.commit();
		
//		/////////////////////////////////////////////////
		
//		Finding Data
		
		Student s2 = session.find(Student.class, 101);
//		if(s2 != null) {
//			System.out.println(s2);
//		}
		
//		/////////////////////////////////////////////////
		
//		Updating Data
		
		Student s3 = session.find(Student.class, 101);
		if(s3!=null) {
			s3.setsAge(23);
			session.merge(s3);
			tx.commit();
//			System.out.println(s3);
			
		}
		
//		////////////////////////////////////////////////
		
//		Deleting Data
		
		Student s4 = session.find(Student.class, 101);
		session.remove(s4);
		
		session.close();
		factory.close();
		
		
	}
}
