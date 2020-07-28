package com.wipro.languagebasics;

public class Ex3 {
	public static void main(String[] args) {
		int sum;
		 
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        sum=num1+num2;
        System.out.println("sum of " +num1 + " and " + num2 +" is " +sum);
	}
}
