package com.rns.collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListCollections {
	
	static int findCapacity(ArrayList<Integer> al) throws Exception {
		 
        Field field = ArrayList.class.getDeclaredField("elementData");
 
        field.setAccessible(true);
 
        return ((Object[]) field.get(al)).length;
 
    }
	
	public static void main(String[] args)  {
		List<String> lst = new ArrayList<String>();
		lst.add("Orange");
		lst.add("Green");
		lst.add("White");
		lst.add("Red");
		lst.add("Green");
		lst.add("White");
		lst.add("Pink");
		lst.add("null");
		lst.add("null");
		lst.add("null");
		lst.add("null");
		lst.add("Blue");
		
		System.out.print(lst);
		System.out.println();
		Iterator itr = lst.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		ListIterator iter = lst.listIterator(lst.size());
		while(iter.hasPrevious()) {
			System.out.print(iter.previous()+" ");
		}
		System.out.println();
		System.out.println("================");
		
	ArrayList<String> lst = new ArrayList<String>();
		System.out.println("Size:"+lst.size());
		System.out.println("Capacity:"+findCapacity(lst));
		System.out.println(lst);
		lst.add("Orange");
		lst.add("Green");
		lst.add("White");
		lst.add("Red");
		lst.add("Green");
		lst.add("White");
		lst.add("Pink");
		lst.add("null");
		lst.add("Blue");
		System.out.println(lst);
		System.out.println("Size:"+lst.size());
		System.out.println("Capacity:"+findCapacity(lst));
		System.out.println(lst);
		lst.add("null");
		lst.add("null");
		lst.add("null");
		System.out.println("Size:"+lst.size());
		System.out.println("Capacity:"+findCapacity(lst));
		
		System.out.println(lst);
		
		System.out.println("===============");
		System.out.println("================");
				
		List<String> vct = new Vector<String>();
		vct.addAll(lst);
		System.out.println(vct);
		System.out.println(vct.size());
		System.out.println(((Vector<String>) vct).capacity());
		vct.add("null");
		vct.add("null");
		vct.add("null");
		System.out.println(vct);
		System.out.println(vct.size());
		System.out.println(((Vector<String>) vct).capacity());
		
		
		
		//Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		set.addAll(lst);
		System.out.print(set);
		System.out.println();
		
		
		
		/*
		[Orange, Green, White, Red, Green, White, Pink, null, Blue]
		===============
		//Vector
		10
		[Orange, Green, White, Red, Green, White, Pink, null, Blue]
		9
		10
		[Orange, Green, White, Red, Green, White, Pink, null, Blue, null, null, null]
		12
		20
		===============================
		// ArrayList
		Size:0
		Capacity:0
		[]
		[Orange, Green, White, Red, Green, White, Pink, null, Blue]
		Size:9
		Capacity:10
		[Orange, Green, White, Red, Green, White, Pink, null, Blue]
		Size:12
		Capacity:15
		[Orange, Green, White, Red, Green, White, Pink, null, Blue, null, null, null]
		===============
		// Set
		[Orange, Green, White, Red, Green, White, Pink, null, null, null, null, Blue]
		===================
		[Orange, Green, White, Red, Pink, null, Blue]
		*/
		
		
		
		
		
	}	
}
