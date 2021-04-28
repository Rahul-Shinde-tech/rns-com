import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmpo {

	public static void main(String[] args) {
		
		Set<Object> set = new TreeSet<Object>();
		
		Empo e1 = new Empo("Mumbai","Sachin",89);
		Empo e2 = new Empo("Hyderabad","Rahane",33);
		Empo e3 = new Empo("bangalore","Virat",55);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);		
		
		Iterator e = set.iterator();
		
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
