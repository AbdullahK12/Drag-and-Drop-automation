package com.Repeated_Chars;

import java.util.Scanner;

public class Repeated_Chars {
	public static void main(String[] args) {
		
		
		String str = "abdullah";
		String[] letter = str.split("");//to split letter by letter
		for(String i : letter) {
			
		}
			for (int i = 0; i <str.length(); i++) {
				int count =1;
				for (int j = i+1; j <str.length(); j++) {
					if(letter[i].equals(letter[j])) {
						count++;
						letter[j]="0";
					}
				}
				if(count>=1 && letter[i]!="0") {
					System.out.println("Letter =" +letter[i]+  "	count= " +count);
				}
			}
		
	}

}
