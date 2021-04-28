import java.util.Set;
import java.util.TreeSet;

public class TestEmployee  {

	public static void main(String[] args) {
		Set<Object> set = new TreeSet<Object>();
		
		Employee e1 = new Employee("SachinT","SamIndia",18);
		Employee e2 = new Employee("RahulD","CrickIndia",55);
		Employee e3 = new Employee("BrateLee","DomAusto",23);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		for(Object o: set) {
			System.out.println(o);
		}
		
	}

}

/*
OUTPUT No. 1 Sorting by using Employee Name Type
D:\rns-com\com.rns..collection.treeset>javac TestEmployee.java
Note: TestEmployee.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\rns-com\com.rns..collection.treeset>java TestEmployee
Employee [ eName=BrateLee, eAdd=DomAusto, eId= 23]
Employee [ eName=RahulD, eAdd=CrickIndia, eId= 55]
Employee [ eName=SachinT, eAdd=SamIndia, eId= 18]

D:\rns-com\com.rns..collection.treeset>


OUTPUT No. 2 Sorting by using Employee Id Type
D:\rns-com\com.rns..collection.treeset>javac TestEmployee.java
Note: TestEmployee.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\rns-com\com.rns..collection.treeset>java TestEmployee
Employee [ eName=SachinT, eAdd=SamIndia, eId= 18]
Employee [ eName=BrateLee, eAdd=DomAusto, eId= 23]
Employee [ eName=RahulD, eAdd=CrickIndia, eId= 55]

D:\rns-com\com.rns..collection.treeset>

OUTPUT No. 3 Sorting by using Employee Address Type
D:\rns-com\com.rns..collection.treeset>javac TestEmployee.java

D:\rns-com\com.rns..collection.treeset>java TestEmployee
Employee [ eName=RahulD, eAdd=CrickIndia, eId= 55]
Employee [ eName=BrateLee, eAdd=DomAusto, eId= 23]
Employee [ eName=SachinT, eAdd=SamIndia, eId= 18]

D:\rns-com\com.rns..collection.treeset>




*/