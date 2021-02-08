package configuration.file;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exam.Answer;
import exam.Exam;
import exam.Question;
import services.ExamServices;

@RestController
public class ExamController {
	
	HttpSession session;
	
	@Autowired
	HttpServletRequest request;
	
	@GetMapping(value = "/exam")
	public String startExam()
	{
		
		session = request.getSession();
		
		if(session.getAttribute("studentId")==null)
		{
			return "Please login before taking exam..";
		}
		
		Integer qNo = (Integer) session.getAttribute("Q_Count");
		
		ExamServices es = new ExamServices();
		Question q = es.fetchQuestion(qNo);
		if(q == null)
			return "Question Limit Exceeded...";
		
		session.setAttribute("Q_Count", qNo+1);
		
		return q.toString();
		
		
	}
	
	@GetMapping(value = "/answer")
	public Answer anserFormat()
	{
		return new Answer();
	}
	
	
	@PostMapping(value = "/exam")
	public String submitAnswer(@RequestBody Answer ans)
	{
		
		session = request.getSession();
		
		if(session.getAttribute("studentId")==null)
		{
			return "Please login before taking exam..";
		}
		
		
		Integer QId = ans.getQuestionNo();
		String option = ""+ans.getOption();
		ExamServices es = new ExamServices();
		
		boolean result = es.Evaluate(QId, option);
		
		if(result == true)
		{	
			int marks = (int)session.getAttribute("marks");
			session.setAttribute("marks",marks+2);
		}
		
		return  startExam();
		
		
	}
	
	@PostMapping(value = "/submit")
	public String submitExam(@RequestBody Answer ans)
	{
		
		session = request.getSession();
		
		if(session.getAttribute("studentId")==null)
		{
			return "Please login before taking exam..";
		}
		
		ExamServices es = new ExamServices();
		
		Integer studentId = (Integer)session.getAttribute("studentId");
		Integer marks = (Integer)session.getAttribute("marks");
		
//		date format
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
		String examDate = ft.format(date);
		
		es.submitResult(new Exam(studentId,examDate,marks));
		
		return  "Exam submitted succesfully...";
		
		
	}
	
	@GetMapping(value = "/result")
	public String Result()
	{
		session = request.getSession();
		
		if(session.getAttribute("studentId")==null)
		{
			return "Please login before taking exam..";
		}
		
		ExamServices es = new ExamServices();
		Integer studentId = (Integer)session.getAttribute("studentId");
		
		return es.showResult(studentId);
		
	}
	
	

}
