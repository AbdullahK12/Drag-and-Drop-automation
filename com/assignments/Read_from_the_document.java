package com.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Read from the notepad
public class Read_from_the_document {
	public static void main(String[] args) throws FileNotFoundException {
		File notepad = new File("C:\\Users\\91814\\OneDrive\\Desktop\\Notepad\\italy quotes.txt");
		Scanner scan = new Scanner(notepad);
		scan.delimiter();
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
	}

}
