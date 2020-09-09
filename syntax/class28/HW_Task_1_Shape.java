package com.syntax.class28;
/*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
 * Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
 * Test your code. 
 */
public interface HW_Task_1_Shape {

	void calculateArea(int a);
	void calculatePerimiter(int a);
}
class Circle implements HW_Task_1_Shape{


	public void calculateArea(int radius) {
	
		int diametr = radius * 2;
		double s = (3.14 *(diametr * diametr)) / 4;
		System.out.println("The area is "+ s);
	}


	public void calculatePerimiter(int radius) {
		
		int diametr = radius *2;
		double p = 3.14 * diametr;
		System.out.println(p);
		
	}

}
class Square implements HW_Task_1_Shape{

	
	public void calculateArea(int a) {

		System.out.println("The perimeter is "+(a * 4));
		
	}


	public void calculatePerimiter(int a) {
	
		System.out.println("The area is "+ (a * 4));
		
	}
	
	
}