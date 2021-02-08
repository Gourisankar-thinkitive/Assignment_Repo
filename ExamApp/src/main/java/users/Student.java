package users;

public class Student {
	
	private int StdId;
	private String name;
	private boolean approval;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdId, String name, boolean ap) {
		super();
		StdId = stdId;
		this.name = name;
		this.approval = ap;
	}
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StdId;
		return result;
	}
	
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StdId != other.StdId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[StdId=" + StdId + ", name=" + name + ", approval=" + approval + "]";
	}
	
	

}
