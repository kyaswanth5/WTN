package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String[] args) {

		  int num=Integer.parseInt(args[0]);
		  int r,revnum=0;
		  while(num>0)
		  {
			  r=num%10;
			  revnum=revnum*10+r;
			  num=num/10;			  
		  }
		  System.out.println(revnum);
	}
}
