package com.wipro.flowcontrolstatements;

public class Ex12 {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=0;
		for(int i=2;i<=x/2;i++)
		{
        if(x%i==0)
		{
        	y=1;
        	break;
		}
		}
        if(y==1)
		System.out.println("not prime number");
        else
        System.out.println("Prime number");
		
	}
}
