package com.syntax.class27;

public class FileTest {

	public static void main(String[] args) {
		
		System.out.println("-------PDF File-------");
		File f = new PDFFile();
		f.edit();
		f.close();
		f.open();
		
		System.out.println("-------Word File-------");
		File f1 = new WordFile();
		f1.edit();
		f1.close();
		f1.open();
		
		System.out.println("-------Java File-------");
		File f2 = new JavaFile();
		f2.edit();
		f2.close();
		f2.open();

		System.out.println();
		System.out.println("-----2 way enhanced for loop------");
		File[] files = {new JavaFile(),new WordFile(), new PDFFile()};
		for( File file : files) {
			file.edit();
			file.close();
			file.open();
		}
	}

}
