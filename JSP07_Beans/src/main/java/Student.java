class Student{
	private String name;
	private int rolnum;

	public Student(String name, int rolnum) {
		this.name = name;
		this.rolnum = rolnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRolnum() {
		return rolnum;
	}

	public void setRolnum(int rolnum) {
		this.rolnum = rolnum;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + this.name + ", rollnumber=" + this.rolnum + "]";
		
	}
}