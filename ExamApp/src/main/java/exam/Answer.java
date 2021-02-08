package exam;

public class Answer {
	
	private int QuestionNo;
	private int Option;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int questionNo, int option) {
		super();
		QuestionNo = questionNo;
		Option = option;
	}
	public int getQuestionNo() {
		return QuestionNo;
	}
	public void setQuestionNo(int questionNo) {
		QuestionNo = questionNo;
	}
	public int getOption() {
		return Option;
	}
	public void setOption(int option) {
		Option = option;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Option;
		result = prime * result + QuestionNo;
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
		Answer other = (Answer) obj;
		if (Option != other.Option)
			return false;
		if (QuestionNo != other.QuestionNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Answer [QuestionNo=" + QuestionNo + ", Option=" + Option + "]";
	}
	
	

}
