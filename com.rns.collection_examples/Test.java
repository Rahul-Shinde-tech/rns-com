package com.rns.collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("c");
		list.add("d");
		list.add(12);
		Iterator itr = list.iterator();
		
		
		while(itr.hasNext()){
			
			Object obj=itr.next();
			System.out.println(obj);
		}
		list.remove(4);
		
		System.out.print(list);
		System.out.print("\n================\n");
		for(Object ob:list) {
			System.out.print(ob+" ");
		}
		System.out.println("===============\n");
		LinkedList lst = new LinkedList();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("A");
		lst.add("F");
		lst.add("G");
		lst.add("G");
		lst.add("null");
		lst.add("h");
		lst.add(0);
		
		Iterator it = lst.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("===============\n");
		
		System.out.println(lst.getFirst());
		System.out.println(lst.getLast());
		System.out.println(lst);
		System.out.println(lst.set(11, "Z"));
		System.out.println(lst.offerFirst("firstNode"));
		System.out.println(lst.offerLast("LastNode"));
		
		System.out.println(lst);
		System.out.println(lst.getFirst());
		System.out.println(lst.getLast());
		
// poll and pollFirst that retrieve and remove the Element from list 
		System.out.println(lst.peek());
		System.out.println("===============\n");
		System.out.println(lst);
		System.out.println("===============\n");
		Iterator itt = lst.descendingIterator();
		while(itt.hasNext()) {
			System.out.print(itt.next()+"== ");
		}
		System.out.println("\n===========\n");
		List lst= new LinkedList();
		lst.addAll(list);
		System.out.println("Wheather lst is Contained list all list elements:"+lst.containsAll(list));
		System.out.println(lst.hashCode());	
		System.out.println("Whather two lists are equals:"+lst.equals(list));
		
		boolean ans = lst.contains("y");
		if(ans)
			System.out.println("Element contains in List");
		else 
			System.out.println("Element is not contains in list");
		
		Iterator itr = lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr.hasNext()){
		    Object str= itr.next();
		    if(str.equals("A")){
		        itr.remove();
		    }
		System.out.println(itr.next());
		}

		LinkedList ls = new LinkedList();
		System.out.println(ls.size());
		ls.addAll(list);
		System.out.println(ls);
		ls.set(8, "H");
		System.out.println(ls.size());
		ls.add("e");
		System.out.println(ls);
		System.out.println(ls.size());
		
		System.out.println("\n===========\n");

		
		