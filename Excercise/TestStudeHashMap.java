package com.rns.collection.examples;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	private int sId;
	private String sName;
	private String sAddress;
	
		
	public Student() {
		super();
	}
	public Student(int sId, String sName, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sId != other.sId)
			return false;
		//if (sName != other.sName)
			//return false;
		return true;
	}
	public int compareTo(Student s) {
		return this.getsId().compareTo(s.getsId());
	}
/*	@Override
	public int compareTo(Student str) {
		return this.getsName().compareTo(str.getsName());
	}*/
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sAddress == null) ? 0 : sAddress.hashCode());
		result = prime * result + sId;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sAddress == null) {
			if (other.sAddress != null)
				return false;
		} else if (!sAddress.equals(other.sAddress))
			return false;
		if (sId != other.sId)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}*/
	
}
public class TestStudeHashMap {
	public static void main(String[] args) {
		
		Student s1 = new Student(110,"Sachin","CricketIndia");
		Student s2 = new Student(104,"Null","TestIndia");
		Student s3 = new Student(104,"Ram","BroIndia");
		Student s4 = new Student(107,"Bravo","NightWest");
		Student s5 = new Student(105,"Pollard","CrickWest");

		Set<Student> set = new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println(set);
		
	}
}


/* HashMap
		Map<Integer,String> map = new HashMap<>();
		map.put(101,"Sachin T");
		map.put(103,"Kartick D");
		map.put(102, "Rahul D");
		map.put(106, "Sourabh G");
		map.put(105,"Dhoni M");
		map.put(104, "Virat K");
		
		System.out.println("1 Way Using Entryset ");
		Iterator<Entry<Integer,String>> ent = map.entrySet().iterator();
		while(ent.hasNext()) {
			Entry<Integer,String> entr = ent.next();
			System.out.println("Key:"+ entr.getKey()+", Values:"+entr.getValue());
		}
		System.out.println("2 Ways Using Keyset ");
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer it = itr.next();
			System.out.print("Key: "+it+", Value: "+map.get(it));
		}
		System.out.println();
		System.out.println("3 Ways Using ForEach Loop \n ");
		for(Map.Entry<Integer,String> ent1 : map.entrySet()) {
			System.out.print("Key:"+ ent1.getKey()+", Values:"+ent1.getValue());
		}
		System.out.println();
		System.out.println("====================");
		System.out.println("1");
		Iterator<Entry<Integer,String>> e= map.entrySet().iterator();
		while(e.hasNext()) {
			Entry<Integer,String> e1 = e.next();
			System.out.print("Key:"+ e1.getKey()+", Values:"+e1.getValue());
		}
		System.out.println();
		System.out.println("2");
		Iterator<Integer> i= map.keySet().iterator();
		while(i.hasNext()) {
			Integer i1= i.next();
			System.out.print("Key:"+ i1+", Values:"+map.get(i1));
		}
		System.out.println();
		System.out.println("3");
		for(Map.Entry<Integer, String> i10:map.entrySet()) {
			System.out.print("Key:"+ i10.getKey()+", Values:"+i10.getValue());
		}
*/