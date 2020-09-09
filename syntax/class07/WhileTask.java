package com.syntax.class07;

public class WhileTask {

	public static void main(String[] args) {
		// how to prin from 50 to 1
		// how to print odds numbers from 1 20
		
	//wrong wary go to the jail because of "code redundancy"
		System.out.println("1");
		System.out.println("3");
		System.out.println("5");
		System.out.println("7");
		System.out.println("9");
		System.out.println("11");
		
		int x = 50;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}
		
System.out.println("--------------odds----------------");
//first way increasing by 2
		int y = 1;
		while ( y < 20) {
			System.out.print(y + " ");
			y += 2;
		}
		System.out.println();
		System.out.println("--------------odds using % ----------------");
	// second way using modulus %
		int z =1;
		while(z <  20) {
			if(z % 2 ==1) {
				System.out.println(z);
			}
			z++;
		}
	
		System.out.println();
		System.out.println("--------------odds ----------------");
	//3rd way 
	int a = 0;
	while (z < 20) {
		a++;
		System.out.println(a);
		a++;
	}
		System.out.println();
		System.out.println("--------------odds ----------------");
	
	//4th way 
	int b = 0;
	while (z < 20) {
		

		System.out.println(++b);
		b++;
	}
	}

}
