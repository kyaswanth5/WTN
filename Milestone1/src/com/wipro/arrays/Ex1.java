package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args) {

		int a[]= {13,34,78,49,23};
		int sum=0,len;
		len=a.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i];
		}
        System.out.println("Sum : "+sum+" Average : "+sum/len);
	}
}
