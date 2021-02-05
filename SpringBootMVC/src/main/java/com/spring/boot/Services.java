package com.spring.boot;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Services {
	
	public void hibernateOps(Employee e)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(e);
		
		t.commit();
		session.close();
		factory.close();
			
			
	}

}
