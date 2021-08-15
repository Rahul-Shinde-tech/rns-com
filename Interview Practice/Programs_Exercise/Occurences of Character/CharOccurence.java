//Count the occurences of character in given String str="adkdsbhfbjh";
import java.util.set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CharOccurence{
	public static void main(String[] args){
		String str ="aabb";
		Map<Character, Integer> map=countOccurence(str);
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			System.out.println("Key :"+entry.getKey()+"==>> Values:"+entry.getValue());
		}
	}
	public static void countOccurence(String str){
		Set<Character> tSet = new TreeSet<>();
		for(int i =0;i<str.length();i++){
			tSet.add(str.charAt(i));
		}
		Map<character,Integer> map = new HashMap<>();
		int count=0;
		Character chr;
		Iterator<Character> itr= tSet.iterator();
		while(itr.hasNext()){
			chr =itr.next();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==chr){
					count++;
					map.put(chr,count);
				}
			}
			count=0;
		}
		return map;
	}
}