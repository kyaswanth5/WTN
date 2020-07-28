package com.wipro.flowcontrolstatements;

public class Ex4 {
	public static void main(String[] args) {
		String str1=args[0];
		String str2=args[1];
		char ch1 = str1.charAt(0);
		char ch2 = str2.charAt(0);
      if(ch1>ch2)
    	  System.out.print(ch2+","+ch1);
      else
    	  System.out.println(ch1+","+ch2);
	}
}
