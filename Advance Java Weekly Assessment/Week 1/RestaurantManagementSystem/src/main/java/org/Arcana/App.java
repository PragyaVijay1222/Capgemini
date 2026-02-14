package org.Arcana;

import org.Arcana.entity.MenuItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

import java.util.Scanner;

public class App {
	public static void addNewItem(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category: ");
		String category = sc.nextLine();
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Is it available: ");
		boolean available = sc.nextBoolean();
		sc.nextLine();
		
		try {
			MenuItem item = new MenuItem(name, price, category, available);
			session.persist(item);
			transaction.commit();
			System.out.println("Item added to menu.");
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void viewMenu(SessionFactory factory) {
		Session session = factory.openSession();
		
		try {
			List<MenuItem> items = session.createQuery("from MenuItem", MenuItem.class).list();
			for(MenuItem item : items) {
				System.out.println(item);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void updatePriceById(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		
		try {
			MenuItem item = session.get(MenuItem.class, id);
			item.setPrice(price);
			session.merge(item);
			transaction.commit();
			System.out.println("Price changed");
		}catch(Exception e) {
			transaction.rollback();
			e.getStackTrace();
		}finally {
			session.close();
		}		
	}
	
	public static void deleteItemById(SessionFactory factory) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		
		try {
			MenuItem item = session.get(MenuItem.class, id);
			if(item!=null) {
				session.remove(item);
				transaction.commit();
				System.out.println("Item removed");
			}else {
				System.out.println("Item not found in the menu");
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
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the choice: [1. Add Menu Item, 2. View all items, 3. Update price, 4. Delete item, 5. Exit]: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				addNewItem(factory);
				break;
			case 2:
				viewMenu(factory);
				break;
			case 3:
				updatePriceById(factory);
				break;
			case 4:
				deleteItemById(factory);
				break;
			case 5:
				factory.close();
				System.out.println("Closing menu");
				return;
			default:
				System.out.println("Enter correct choice");
			}
		}
		
	}
}
