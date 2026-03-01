package org.Arcana.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		MultipleLaptops laptop = new MultipleLaptops();
		laptop.setBrand("Asus");
		laptop.setModel("Rog");
		laptop.setRam(32);
		laptop.setId(11);
		
		MultipleLaptops laptop1 = new MultipleLaptops();
		laptop1.setBrand("HP");
		laptop1.setModel("Pavellion");
		laptop1.setRam(32);
		laptop1.setId(12);
		
		AlienStudentsMultipleLaptops a1 = new AlienStudentsMultipleLaptops();
		a1.setaId(100);
		a1.setaName("Spring");
		a1.setaTech("Java");
		a1.addLaptop(laptop);
		a1.addLaptop(laptop1);
		
		laptop.setAliens(a1);
		laptop1.setAliens(a1);
		
		session.persist(laptop);
		session.persist(laptop1);
		session.persist(a1);
		tx.commit();
		
		session.close();
		factory.close();
	}
}
