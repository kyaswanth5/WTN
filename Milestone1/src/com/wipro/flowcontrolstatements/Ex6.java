package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String[] args) {
        String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender=="female")
		{
			System.out.println(age);
		if(age>=1&&age<=58)
		{
		System.out.println("the percentage of intrest is 8.2%");
		}
		else if(age>=59&&age<=100)
		{
		System.out.println("the percentage of intrest is 9.2%");
		}
		}
		else if(gender=="male")
		{
			System.out.println(age);
		if(age>=1&&age<=58)
		{
		System.out.println("the percentage of intrest is 8.4%");
		}
		else if(age>=59&& age<100)
		{ 
		System.out.println("the percentage of intrest is 10.5%");
		}
		}
		
     }

}
