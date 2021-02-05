package com.spring.boot;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Services {
	
	public void insert(Employee e)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(e);
		System.out.println("data inserted to SpringRESTEmp table");
		t.commit();
		session.close();
		factory.close();
		
	}
	public List<Employee> display()
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("From Employee");
		List<Employee> l = q.list();
		
		t.commit();
		session.close();
		factory.close();
		return l;
		
	}

}
