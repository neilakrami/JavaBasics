package com.syntax.class25;

public class ComputerTest {
	public static void main(String[] args) {
		
	
	Computer apple = new Apple("Apple","Macbook Pro", 1000);
	Computer lenovo = new Lenovo("Deskto","Standalone", 100);
	Computer hp = new HP("Laptop","Pavilion x360", 200);
	Computer Dell = new Dell("Laptop","Dell", 300,"Red");
	
	Computer[] computer= { new Apple("Apple","Macbook Pro", 1000),
							new Lenovo("Deskto","Standalone", 100),
							new HP("Laptop","Pavilion x360", 200),
							new Dell("Laptop","Dell", 300,"Red")};
	
	int size = computer.length;
	System.out.println(size);

	for(Computer com : computer) {
		com.Camera();
		com.Charger();
		
	}
	}
	
}
