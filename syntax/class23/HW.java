package com.syntax.class23;

public class HW {
//Area , squar, rectangle
		public static double Area(double length, double width) {
			return length * width;
		}
		public double Area(double length) {
			return length * length;
		}
		public double Area(double length, double width, double height) {
			return 2 * length * width + 2 * length * height + 2 * width * height;
		}
		public static void main(String[] args) {
			HW obj = new HW();
			System.out.println(Area(3.3,3.3));
			System.out.println(obj.Area(3.3));
			System.out.println(obj.Area(2.3, 3.5, 4.4));
		}
	}











