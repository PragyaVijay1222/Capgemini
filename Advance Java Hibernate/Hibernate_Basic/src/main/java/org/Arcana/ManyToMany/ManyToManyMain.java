package org.Arcana.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LabLaptops laptop = new LabLaptops();
		laptop.setBrand("Asus");
		laptop.setModel("Rog");
		laptop.setRam(32);
		laptop.setId(11);
		
		LabLaptops laptop1 = new LabLaptops();
		laptop1.setBrand("HP");
		laptop1.setModel("Pavellion");
		laptop1.setRam(32);
		laptop1.setId(12);
		
		LabLaptops laptop2 = new LabLaptops();
		laptop2.setBrand("Dell");
		laptop2.setModel("XPS");
		laptop2.setRam(32);
		laptop2.setId(113);
		
		AlienStudents a1 = new AlienStudents();
		a1.setaId(100);
		a1.setaName("Spring");
		a1.setaTech("Java");
		a1.addLaptop(laptop);
		a1.addLaptop(laptop1);
		
		AlienStudents a2 = new AlienStudents();
		a2.setaId(101);
		a2.setaName("Autum");
		a2.setaTech("C++");
		a2.addLaptop(laptop);
		a2.addLaptop(laptop1);
		a2.addLaptop(laptop2);
		
		laptop.addAliens(a1);
		laptop.addAliens(a2);
		laptop1.addAliens(a1);
		laptop1.addAliens(a2);
		laptop2.addAliens(a2);
		
		session.persist(laptop);
		session.persist(laptop1);
		session.persist(laptop2);
		session.persist(a1);
		session.persist(a2);
		tx.commit();
		
		System.out.println(a1);
		System.out.println(a2);
		
		session.close();
		factory.close();
	}
}
