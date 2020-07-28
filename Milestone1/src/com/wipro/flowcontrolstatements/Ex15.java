package com.wipro.flowcontrolstatements;

public class Ex15 {
	public static void main(String[] args) {

		int x=Integer.parseInt(args[0]);
		int s=0,r;
		while(x>0)
		{
			r=x%10;
			s=s+r;
			x=x/10;
			
		}
		System.out.println("Sum of digits is : "+s);

	}
}
