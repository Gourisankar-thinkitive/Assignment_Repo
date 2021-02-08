package services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import users.Student;

public class LoginServices {
	
	public boolean StudentLogin(Student s)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		int sid = s.getStdId();
		String query = "from Student where StdId= :id and approval= :app";
		Query q = session.createQuery(query);
		q.setParameter("id", sid);
		q.setParameter("app", true);
		
		List<Student> l = q.list();
		
		if(l==null)
			return false;
		
		System.out.println(l);
		
		tx.commit();
		session.close();
		factory.close();
		
		return true;
	}
}
