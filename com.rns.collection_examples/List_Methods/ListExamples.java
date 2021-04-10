import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add("Rama");
		a1.add("Laxmana");
		a1.add("Hanumana");
		a1.add("");
		a1.add("Laxmana");
		System.out.println("ArrayList Elements are :"+a1);
		
		List l1 = new LinkedList();
		l1.add("Rama");
		l1.add("Laxmana");
		l1.add("Hanumana");
		l1.add("");
		l1.add("Laxmana");

		System.out.println("Linked List Elements are:"+l1);
		
		// Creating a list
        List<Integer> l2  = new ArrayList<Integer>();
  
        // Adds 1 at 0 index
        l2.add(0, 1);
  
        // Adds 2 at 1 index
        l2.add(1, 2);
        System.out.println(l2);
  
        // Creating another list
        List<Integer> l3  = new ArrayList<Integer>();
  
        l3.add(1);
        l3.add(2);
        l3.add(3);
        System.out.println(l3);
        // Will add list l2 from 1 index
        l2.addAll(1, l3);
        System.out.println(l2);
  
        // Removes element from index 1
        l2.remove(1);
        System.out.println(l2);
  
        // Prints element at index 3
        System.out.println(l2.get(3));
  
        // Replace 0th element with 5
        l2.set(0, 5);
        System.out.println(l2);
 
	}

}

/*<<---- Output --->>
* ArrayList Elements are :[Rama, Laxmana, Hanumana, , Laxmana]
* Linked List Elements are:[Rama, Laxmana, Hanumana, , Laxmana]
* [1, 2]
* [1, 2, 3]
* [1, 1, 2, 3, 2]
* [1, 2, 3, 2]
* 2
* [5, 2, 3, 2]
*/

/*<<--- Output--->>
* D:\MyPracticePrograms\com.rns.collection_examples\List_Methods>javac ListExamples.java
* Note: ListExamples.java uses unchecked or unsafe operations.
* Note: Recompile with -Xlint:unchecked for details.
* 
* D:\MyPracticePrograms\com.rns.collection_examples\List_Methods>java ListExamples
* ArrayList Elements are :[Rama, Laxmana, Hanumana, , Laxmana]
* Linked List Elements are:[Rama, Laxmana, Hanumana, , Laxmana]
* [1, 2]
* [1, 2, 3]
* [1, 1, 2, 3, 2]
* [1, 2, 3, 2]
* 2
* [5, 2, 3, 2]
* 
* D:\MyPracticePrograms\com.rns.collection_examples\List_Methods> 
*/