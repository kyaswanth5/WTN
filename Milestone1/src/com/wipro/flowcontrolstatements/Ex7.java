package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String[] args) {
		String str=args[0];
		char ch= str.charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println(ch+"->"+str.toUpperCase());
		else if(ch>='A'&&ch<='Z')
			System.out.println(ch+"->"+str.toLowerCase());


	}
}
