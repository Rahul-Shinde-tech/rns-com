public final class Student{
	private final int studentId;
	private final String studentName;
	private final Address address;
		
	public Student(int studentId, String studentName,Address address){
		this.studentId=studentId;
		this.studentName=studentName;
		Address add = new Address();
		add.setCity(address.getCity());
		add.setPinCode(address.getPinCode());
		this.address=add;
		
	}
	public int getStudentId(){
		return this.studentId;
	}
	
	public String getStudentName(){
		return this.studentName;
	}
	
	public Address getAddress(){
		Address add = new Address();
		add.setCity(address.getCity());
		add.setPinCode(address.getPinCode());
		return add;
	}
	
	public String toString(){
		return "Student[studentId="+studentId+", studentName="+studentName+", Address="+address+"]";
	}
}



