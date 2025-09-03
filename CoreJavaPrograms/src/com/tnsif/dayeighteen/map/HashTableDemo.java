package com.tnsif.dayeighteen.map;

import java.util.Enumeration;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Nitin", "nitin123@gmail.com");
		ht.put("Deepak", "deepak123@gmail.comss");
		ht.put("Harish", "harish123@gmail.com");
		ht.put("Ravi", "ravi123@gmail.com");
		System.out.println("\nHashtable with name and emailId");
		System.out.println(ht);

		System.out.println("\nTraversing a Hashtable\n");
		Enumeration em = ht.keys();
		while (em.hasMoreElements()) {
			String nm = em.nextElement().toString();
			System.out.println(nm + " : " + ht.get(nm));
		}

	}
}