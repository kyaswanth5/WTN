package com.wipro.flowcontrolstatements;

public class Ex5 {
	public static void main(String[] args) {
		String str=args[0];
		char ch = str.charAt(0);
		if(ch>=65&&ch<=90||ch>=97&&ch<=122)
			System.out.println("\'Alphabhet\'");
		else if(ch>=48&&ch<=57)
			System.out.println("\'Digit\'");
		else
			System.out.println("\'Special Character\'");
		
	}
}
