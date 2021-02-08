package services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import exam.Exam;
import exam.Question;
import users.Student;

public class ExamServices {
	
	public Question fetchQuestion(int id)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query = "from Question where qid= :id";
		Query q = session.createQuery(query);
		q.setParameter("id", id);
		
		List<Question> l = q.list();
		
		tx.commit();
		session.close();
		factory.close();
		
		if(l.size() == 0)
			return null;
		
		return l.get(0);
	}
	
	public boolean Evaluate(int qid, String ans)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Question.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query = "from Question where qid= :id and answer= :ans";
		Query q = session.createQuery(query);
		q.setParameter("id", qid);
		q.setParameter("ans", ans);
		
		List<Question> l = q.list();
		
		tx.commit();
		session.close();
		factory.close();
		
		if(l.size() == 0)
			return false;
		
		return true;
	}
	
	
	public void submitResult(Exam e)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Exam.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		
		tx.commit();
		session.close();
		factory.close();
	}
	
	public String showResult(int sid)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Exam.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query = "from Exam where sid= :sid";
		Query q = session.createQuery(query);
		q.setParameter("sid", sid);
		
		List<Exam> l = q.list();
		
		
		
		tx.commit();
		session.close();
		factory.close();
		
		if(l.size() == 0)
			return "No record found";
		
		
		Exam e = l.get(0);
		
		String result = "Marks Obtained : "+e.getMarks()+"/10";
		return result;
	}
	
}
