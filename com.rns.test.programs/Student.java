class Student 
{
    int stdRegister;
	String stdName;
	int Subject1;
	int Subject2;
	
	Student(int stdRegister,String stdName,int Subject1,int Subject2)
	{
		this.stdRegister = stdRegister;
		this.stdName=stdName;
		this.Subject1=Subject1;
		this.Subject2=Subject2;
	
	}
	void display()
	{
	System.out.println(stdRegister +" "+stdName+" "+Subject1+" "+Subject2);
	
	}
	public static void main(String[] args)
	{
	Student Det = new Student(1,"Rahul",20,20);
	
	
	}
}