package users;

public class Teacher {
	
	private int Tid;
	private String name;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String name) {
		super();
		Tid = tid;
		this.name = name;
	}
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
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
		result = prime * result + Tid;
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
		Teacher other = (Teacher) obj;
		if (Tid != other.Tid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Teacher [Tid=" + Tid + ", name=" + name + "]";
	}
	
	

}
