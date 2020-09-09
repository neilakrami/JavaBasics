package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;




public class SetExample {



	public static void main(String[] args) {
		
// creating an object of HashSet
		
		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		
		System.out.println(brand.size());
		System.out.println(brand);
		//how to verify if element is there
		boolean isIThere = brand.contains("Nike");
		System.out.println(isIThere);
		
		//how to access element from a Set Collection?
		//brand.get --> id not avilable to objects of Set type
		
		Iterator<String> iterator = brand.iterator();
		
		String obj =iterator.next();
		System.out.println(obj);
		
		obj = iterator.next();
		System.out.println(obj);
		
		System.out.println("------------Using  while loop to get values form iterator object-----------");
		while(iterator.hasNext()) {
			obj = iterator.next();
			System.out.println(obj);
		}
		//if we need to iterate over entire collection again we need NEW ITERATOR OBJEC
		
		System.out.println("------------Using  while loop to get values form it object-----------");
		Iterator<String> it = brand.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//is there other way to get all elements from Set collection?
//		for(int i =0; i<brand.size(); i++) { ---> we can not use regular forloop it do not have set and get method
//		
//		}
			System.out.println("------------Using  for each loop to get values form set collection-----------");

		
		for(String br:brand) {
			System.out.println(br);
		}
		
		System.out.println("------------Creating an object of LinkedHashSet-----------");

		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();//--> No dublicat and print in order
		
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		
		System.out.println(luxBrand.size());
		System.out.println(luxBrand);
		
		
		System.out.println("------------Creating an object of TreehSet-----------");
		
		TreeSet<String> allBrands = new TreeSet<>(brand);
		allBrands.add("Calvin klein");
		allBrands.addAll(luxBrand);
		
		System.out.println(allBrands);
		
		System.out.println();
		
		System.out.println("------------  Retrieving elements from TreeSet-----------");
		Iterator<String> brandIterator= allBrands.iterator(); 
		
		while(brandIterator.hasNext()) {
			String br = brandIterator.next();
			System.out.println(br);
		}
		
		System.out.println("------------ Creating an object of TreeSet to store Double-----------");
		
		Set<Double> tSet=new TreeSet<>();
		tSet.add(1.99);
		tSet.add(10.99);
		tSet.add(1000.99);
		tSet.add(10.01);
		tSet.add(10.99);
		System.out.println(tSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}










































































