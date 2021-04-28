
class Employee implements Comparable<Employee>{
	private int eId;
	private String eName;
	private String eAdd;
		
	public Employee( String eName, String eAdd, int eId) {
		super();
		this.eName = eName;
		this.eAdd = eAdd;
		this.eId = eId;
	}
	public Employee() {
		super();
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAdd() {
		return eAdd;
	}
	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	
	@Override
	public String toString() {
		return "Employee [ eName=" + eName + ", eAdd=" + eAdd + ", eId= " + eId + "]";
	}
	//@Override
	//public int compareTo(Employee e) {
	//	return this.geteName().compareTo(e.geteName());
	//}
	/*@Override
	public int compareTo(Employee e) {
		if(this.geteId()==e.geteId())
			return 0;
		else if(this.geteId()<e.geteId())
			return -1;
		else
			return 1;
	}*/
	
	@Override
	public int compareTo(Employee e) {
		return this.geteAdd().compareTo(e.geteAdd());
	}
	
	
}
