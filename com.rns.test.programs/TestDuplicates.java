// Write a Immutable Class which for Student 

final class ImmutableStudent 
{
	private final int sid;
	private final String sname;
	Age age;
	
	public int getSid(){
		return this.sid;
	}
	
	public String getSname(){
		return this.sname;
	}
	
	public Age getAge(){
		Age copyage = new Age();
		copyage.setDay(this.age.getAge());
		copyage.setMonth(this.age.getMonth());
		copyage.setYear(this.age.getYear());
		
		return this.copyage;
	}
	public void ImmutableStudent(int sid, String sname, Age age){
		this.sid= sid;
		this.sname = sname;
		Age copyage = new Age();
		copyage.setDay(age.getDay());
		copyage.setMonth(age.getMonth());
		copyage.setYear(age.getYear());
		this.age = copyage;
	}
}
public class Age
{
	int day;
	int month;
	int year;
	
	public int getDay(){
		return this.day;
	}
	
	public void setDay(int day){
		this.day = day; 
	}
	public int getMonth(){
		return this.month;
	}
	
	public void setMonth(int month){
		this.month = month; 
	}
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year){
		this.year = year; 
	}
}

public class testImstudent{
	public static void main(String[] args ){
	Age a = new Age();
	a.setDay(1);
	a.setMonth(12);
	a.setYear(1995);
	ImmutableStudent is = new ImmutableStudent(1,"ram",a);
	System.out.println(is.getSid()+" "+is.getSname()+" "+ is.getAge().getYear());
	a.setYear(2000);
	System.out.println(is.getSid()+" "+is.getSname()+" "+ is.getAge().getYear());
		
	}
}