package com.wipro.flowcontrolstatements;
import java.util.*;
public class Ex16 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter an integer number");
		int num=s.nextInt();
		  s.close();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
