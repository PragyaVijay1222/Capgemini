package org.Arcana;

import org.Arcana.OneToOne.AlienStudent;
import org.Arcana.OneToOne.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Laptop laptop = new Laptop();
		laptop.setBrand("Asus");
		laptop.setModel("Rog");
		laptop.setRam(32);
		laptop.setId(11);
		
		AlienStudent a1 = new AlienStudent();
		a1.setaId(100);
		a1.setaName("Spring");
		a1.setaTech("Java");
		a1.setLaptop(laptop);
		laptop.setStudent(a1);
		
		session.persist(laptop);
		session.persist(a1);
		tx.commit();
		
		session.close();
		factory.close();
	}
}
