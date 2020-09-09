package com.syntax.class27;

public abstract class File {//noun
	
	
	public void edit() {
		System.out.println("File can always be edited");
	}
	
	public void close() {
		System.out.println("File can always be closed");
	}
	public abstract void open();

}

class JavaFile extends File{
	
	public void open() {
		System.out.println("To open .java file we need NotePad++ or sublime text");
		
	}
}

class WordFile extends File{
	
	public void open() {
		System.out.println("To open .doc file we need Microsoft Word to be installed");
	}
}

class PDFFile extends File{
	public void open() {
		System.out.println("To open .pdf file we need Adobe Acrobat Reader to installed");
	}
}