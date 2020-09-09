package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* Task - 1
 * Create a Set collection in which you need to add names of the countries. 
 * In this set we want all objects to be sorted in alphabetical order.
 *  Using 2 different ways retrieve all elements from set.
 */
public class Countries {

	public static void main(String[] args) {
		
		Set<String> country = new TreeSet<>();
		country.add("Germany");
		country.add("Russia");
		country.add("America");
		country.add("Brazil");
		country.add("China");
		
	
		System.out.println("--------First way for loop--------");
		for(String countries: country) {
			System.out.println(countries +", ");
		}
		System.out.println("--------Second way while loop--------");
		
		Iterator<String> itCountry = country.iterator();
		while(itCountry.hasNext()) {
			System.out.println(itCountry.next() +", ");
		}
		System.out.println();
	}
}

//package com.syntax.class31;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;
//import com.syntax.class31.Student;
// public class Task {
//	public static void main(String[] args) {
//		
//		Set<String> countries = new TreeSet<>();
//		countries.add("Ukraine");
//		countries.add("Russia");
//		countries.add("USA");
//		countries.add("France");
//		countries.add("Germany");
//		
//		for(String country : countries) {
//			System.out.print(country + ", ");
//		}
//		System.out.println();
//		
//		Iterator<String> itCountry = countries.iterator();
//		while(itCountry.hasNext()) {
//			System.out.print(itCountry.next() + ", ");
//		}
//		System.out.println();
//		
//		Set<String> cities = new LinkedHashSet<>();
//		cities.add("Kiev");
//		cities.add("Moscow");
//		cities.add("Washington DC");
//		cities.add("Paris");
//		cities.add("Almaty");
//		
//		Iterator<String> itCity = cities.iterator();
//		while(itCity.hasNext()) {
//			String city = itCity.next();
//			if(city.startsWith("A")) {
//				itCity.remove();
//			}
//		}
//		System.out.println(cities);
//		System.out.println();
//		
//		Set<Student> students = new HashSet<>();
//		students.add(new Student(101, "John Nelson"));
//		students.add(new Student(102, "Ann Taylor"));
//		for(Student student:students) {
//			student.print();
//			System.out.println("------------");
//		}
//		
//	}
//}