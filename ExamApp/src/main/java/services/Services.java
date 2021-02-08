package services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.loader.plan.exec.internal.CollectionReferenceAliasesImpl;

import exam.Question;
import users.Student;
import users.Teacher;

public class Services {
	
	public void StudentRegistration(Student s)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(s);
		
		t.commit();
		session.close();
		factory.close();
	}
	
	public void TeacherRegistration(Teacher t)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(t);
		
		tx.commit();
		session.close();
		factory.close();
	}
	
	public List<Student> PendingApprovals()
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query q = session.createQuery("From Student where approval = 0");
		
		List<Student> l = q.list();
		tx.commit();
		session.close();
		factory.close();
		
		return l;
	}
	
	public boolean Approve(Student s)
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(s);
		
		tx.commit();
		session.close();
		factory.close();
		
		return true;
	}
	
	public List<Question> getQuestion()
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query q = session.createQuery("from Question");
//		Query q = session.createQuery("from Question");
		
		List<Question> l = q.list();
		tx.commit();
		session.close();
		factory.close();
		
		return l;
	}
	
	public void addQuestion(Question q)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q);
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}
	
	public void updateQuestion(Question q)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(q);
		
		tx.commit();
		session.close();
		factory.close();
	}
	
	public void deleteQuestion(Question q)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(q);
		
		tx.commit();
		session.close();
		factory.close();
	}
	
	
}
