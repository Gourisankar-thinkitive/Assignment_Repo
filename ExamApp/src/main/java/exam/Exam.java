package exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Exam {
	
	@Id
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "examdate")
	private String ExamDate;
	
	@Column(name = "marks")
	private int marks;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(int sid, String examDate, int marks) {
		super();
		this.sid = sid;
		ExamDate = examDate;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getExamDate() {
		return ExamDate;
	}

	public void setExamDate(String examDate) {
		ExamDate = examDate;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		if (sid != other.sid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exam [sid=" + sid + ", ExamDate=" + ExamDate + ", marks=" + marks + "]";
	}
	
	
	
}
