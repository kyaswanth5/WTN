package com.wipro.arrays;

public class Ex11 {
	public static void main(String[] args) {
		int arr[]= {1, 4, 1, 4};
		int len=arr.length;

	boolean s=true;
	for(int i=0;i<len;i++)
	{
	if(arr[i]!=1&&arr[i]!=4)
	  s=false;
	}
	   System.out.print(s);

	}

}
