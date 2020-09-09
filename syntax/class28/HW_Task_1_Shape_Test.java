package com.syntax.class28;

public class HW_Task_1_Shape_Test {

	public static void main(String[] args) {
	
		System.out.println("----------- Circle------------");

		HW_Task_1_Shape a = new Circle();
		a.calculateArea(4);
		a.calculatePerimiter(4);
		
		
		System.out.println("----------- Square------------");
		HW_Task_1_Shape b = new Square();
		b.calculateArea(5);
		b.calculatePerimiter(5);
	}

}
