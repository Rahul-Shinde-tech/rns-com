import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmpo {

	public static void main(String[] args) {

		Set<Object> set = new TreeSet<Object>(new Comparator() {
			@Override
			public int compare(Object e1, Object e2) {
				Empo ob1 = (Empo) e1;
				Empo ob2 = (Empo) e2;
				//return ob1.geteName().compareTo(ob2.geteName());
				if( ob1.geteId()==ob2.geteId())
					return 0;
				else if ( ob1.geteId()<ob2.geteId())
					return -1;
				else
					return 1;
			}
		});
		Empo e1 = new Empo("Mumbai", "Sachin", 89);
		Empo e2 = new Empo("Hyderabad", "Rahane", 33);
		Empo e3 = new Empo("bangalore", "Virat", 55);

		set.add(e1);
		set.add(e2);
		set.add(e3);

		Iterator e = set.iterator();

		while (e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
/* OUTPUT 1 - By Employee Name 
D:\rns-com\com.rns..collection.treeset>javac TestEmpo.java

D:\rns-com\com.rns..collection.treeset>java TestEmpo
Exception in thread "main" java.lang.ClassCastException: Empo cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(Unknown Source)
        at java.util.TreeMap.put(Unknown Source)
        at java.util.TreeSet.add(Unknown Source)
        at TestEmpo.main(TestEmpo.java:15)

D:\rns-com\com.rns..collection.treeset>javac TestEmpo.java
Note: TestEmpo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\rns-com\com.rns..collection.treeset>java TestEmpo
Empo [eAdd=Hyderabad, eName=Rahane, eId=33]
Empo [eAdd=Mumbai, eName=Sachin, eId=89]
Empo [eAdd=bangalore, eName=Virat, eId=55]

OUTPUT - 2

D:\rns-com\com.rns..collection.treeset>javac TestEmpo.java
Note: TestEmpo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\rns-com\com.rns..collection.treeset>java TestEmpo
Empo [eAdd=Hyderabad, eName=Rahane, eId=33]
Empo [eAdd=bangalore, eName=Virat, eId=55]
Empo [eAdd=Mumbai, eName=Sachin, eId=89]

D:\rns-com\com.rns..collection.treeset>


*/