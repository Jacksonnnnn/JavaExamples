package com.Jacksonnn.java.util;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		//Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		
		//Add elements to the Array List.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		//Use iterator to display conents of al.
		System.out.println("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
		}
		System.out.println();
		
		//Modify objects being iterated.
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			System.out.println(element + "+ ");
		}
		
		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + "+ ");
		}
		System.out.println();
		
		//Now, display the list backwards.
		System.out.println("Modified list backwards: ");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + "+ ");
		}
		System.out.println();
	}
}
