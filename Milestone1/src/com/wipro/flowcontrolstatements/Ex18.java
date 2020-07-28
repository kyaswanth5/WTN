package com.wipro.flowcontrolstatements;

public class Ex18 {
	public static void main(String[] args) {

		 int num=Integer.parseInt(args[0]);
		  int r,revnum=0;
		  int n=num;
		  while(num>0)
		  {
			  r=num%10;
			  revnum=revnum*10+r;
			  num=num/10;
			  
		  }
		  
		  if(n==revnum)
			  System.out.println(n+" is a palindrome");
		  else
			  System.out.println(n+" is not a palindrome");

	}

}
