import java.util.HashSet;
import java.util.ArrayList;

public class DupMisNumber{
	public static void main(String[] args){
		int[] arr={1,2,3,4,4,4,5,6,9};
		isDuplicatesAndMissing(arr);
	}
	
	public static void isDuplicatesAndMissing(int[] arr){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		HashSet<Integer> resultSet = new HashSet<>();
		
		int previous = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==previous){
				resultSet.add(arr[i]);
			}else{
				previous=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++ ){
			list1.add(arr[i]);
			
		}
		
		for(int i=1;i<10;i++){
			list2.add(i);
		}
		
		list1.forEach(p->System.out.print(p+" "));
		System.out.println();
		list2.forEach(e->System.out.print(e+" "));
		System.out.println();
		
		
		for(int i=0;i<list2.size();i++){
			if(list1.contains(list2.get(i))){
				continue;
			}else{
				resultSet.add(list2.get(i));
			}
		}
		System.out.println("Missing and Duplicate Numbers are:");
		resultSet.forEach(p->System.out.print(p+" "));
	}
}