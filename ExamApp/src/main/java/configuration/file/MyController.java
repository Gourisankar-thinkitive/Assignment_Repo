package configuration.file;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import exam.Question;
import services.LoginServices;
import services.Services;
import users.Student;
import users.Teacher;

@RestController
public class MyController {
	
	private boolean AdminLogged = false; 
	private boolean TeacherLogged = false;
	
	HttpSession session;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home()
	{
		return "Home";
	}
	
	
	//	Admin section
	
	@PostMapping(value = "/admin/{u},{p}")
	public String AdminLogin(@PathVariable("u") String username,@PathVariable("p") String password)
	{
		String adminName = "admin";
		String securityCode = "root";
		
		System.out.println(username + "-" +password);
		
		if(adminName.equals(username) && securityCode.equals(password))
		{
			AdminLogged = true;
		}
		
		return "Admin Login Succsfull";
		
	}
	
	@GetMapping(value = "admin/approvals")
	public List<Student> PendingApprovals()
	{
		if(AdminLogged)
		{
			Services s = new Services();
			
			return s.PendingApprovals();
		}
		
		return null;
		
	}
	
	@PutMapping(value = "admin/approvals")
	public String Approvals(@RequestBody Student st)
	{
		if(AdminLogged)
		{
		Services s = new Services();
		s.Approve(st);
		return "approved successfull..";
		}
		
		return "Admin login required..";
		
	}
	
	
	//	Student section
	
	@GetMapping(value = "/student")
	public Student StudentFormat(@RequestBody Student student)
	{
		
		return student;
	}
	
	@PostMapping(value = "/student")
	public String StudentRegistration(@RequestBody Student student)
	{
		Services service = new Services();
		service.StudentRegistration(student);
		
		return student.toString()+"\nRegistration Successfull...\nWait for Approval";
	}
	
	
	@PostMapping(value = "/studentlogin")
	public String StudentLogin(@RequestBody Student s)
	{
		LoginServices ls = new LoginServices();
		if(ls.StudentLogin(s) == true)
		{	
			session = request.getSession();
			session.setAttribute("studentId", s.getStdId());
			session.setAttribute("Q_Count", 1);
			session.setAttribute("marks", 0);
			return "Student Login succesfull";
		}
		return "invalid student id....";
	}
	
	
	//	Teacher section
	
	@GetMapping(value = "/teacher")
	public Teacher TeacherFormat(@RequestBody Teacher teacher)
	{
		
		return teacher;
	}
	
	@PostMapping(value = "/teacher")
	public String TeacherRegistration(@RequestBody Teacher teacher)
	{
		Services service = new Services();
		service.TeacherRegistration(teacher);
		
		return teacher.toString()+"\nTeacher Registration Successfull...";
	}
	
	
	//	Question section
	
	@GetMapping(value = "question")
	public Question getQuestion()
	{
		return new Question();
	}
	@GetMapping(value = "questions")
	public List<Question> getQuestions()
	{
		if(AdminLogged || TeacherLogged)
		{
			Services s = new Services();
			return s.getQuestion();
		}
		
		return null;
		
	}
	
	@PostMapping(value = "questions")
	public String addQuestions(@RequestBody Question q)
	{
		if(AdminLogged || TeacherLogged)
		{
		Services s = new Services();
		
		s.addQuestion(q);
		
		return "Question added Succesfully..";
		}
		
		return "permission denied..";
	}
	
	@PutMapping(value = "questions")
	public String updateQuestions(@RequestBody Question q)
	{
		if(AdminLogged || TeacherLogged)
		{
			Services s = new Services();
		
			s.updateQuestion(q);
		
		return "Question updated Succesfully..";
		}
		
		return "permission denied..";
	}
	
	@DeleteMapping(value = "questions")
	public String deleteQuestions(@RequestBody Question q)
	{
		if(AdminLogged || TeacherLogged)
		{
		Services s = new Services();
		s.deleteQuestion(q);
		return "Question deleted Succesfully..";
		}
		
		return "permission denied..";
		
	}
	
	
	
	
	
	
	
	
	

}
