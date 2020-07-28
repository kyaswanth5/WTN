package com.wipro.flowcontrolstatements;

public class Ex14 {
	public static void main(String[] args) {

		int x=Integer.parseInt(args[0]);
		int y=0;
		if(x==1||x==0)
			System.out.println(x+" is neither prime nor composite");
		else
		{
		for(int i=2;i<=x/2;i++)
		{
        if(x%i==0)
		{
        	y=1;
        	break;
		}
		}
        if(y==1)
		System.out.println(x+" not prime number");
        else
        System.out.println(x+" Prime number");
		}

	}
}
