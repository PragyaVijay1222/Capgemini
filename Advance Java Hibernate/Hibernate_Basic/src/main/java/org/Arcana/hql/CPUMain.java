package org.Arcana.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.TypedQuery;

public class CPUMain {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
		
//		CPU cpu1 = new CPU();
//		cpu1.setBrand("HCL");
//		cpu1.setId(10);
//		cpu1.setModel("XCTYC");
//		cpu1.setRam(32);
//		
//		CPU cpu2 = new CPU();
//		cpu2.setBrand("HP");
//		cpu2.setId(11);
//		cpu2.setModel("HPcell");
//		cpu2.setRam(48);
//		
//		CPU cpu3 = new CPU();
//		cpu3.setBrand("Asus");
//		cpu3.setId(12);
//		cpu3.setModel("NINEus");
//		cpu3.setRam(32);
//		
//		CPU cpu4 = new CPU();
//		cpu4.setBrand("Ryzen");
//		cpu4.setId(13);
//		cpu4.setModel("PlusGaming");
//		cpu4.setRam(48);
//		
//		session.persist(cpu1);
//		session.persist(cpu2);
//		session.persist(cpu3);
//		session.persist(cpu4);
//		
//		tx.commit();
		
//		/////////////////////////////////////////

//		Hibernate Query Language
		
//		Select * from cpu_table where ram = 32; -> SQL
//		from CPU where ram = 32;
		
		Query query = session.createQuery("from CPU where ram = 32", CPU.class);
		List<CPU> cpus = query.getResultList();
		
		cpus.stream().forEach(System.out::println);
		
//		Select brand, model from cpu where brand like "Asus";
		
		String brand = "Asus";

		TypedQuery<CPU> query1 = session.createQuery("from CPU c where c.brand like ?1",CPU.class);
		query1.setParameter(1, brand);

		List<CPU> cpuss = query.getResultList();

		for (CPU cpu : cpuss) {
		    System.out.println(cpu.getBrand() + " " + cpu.getModel());
		}
		
		session.close();
		factory.close();
	}
}
