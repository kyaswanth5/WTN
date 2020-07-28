package com.wipro.arrays;

public class Ex9 {
	public static void main(String[] args) {
		int arr[]= {1, 10, 10, 2};
		int len=arr.length;
		int [] arr2= new int[len];
		int j=0;
		for(int i=0;i<len;i++){
		if(arr[i]==10)
		{
		}
		else
		{
		arr2[j]=arr[i];
		j++;
		}
		}
		for(int i=j;i<len;i++)
		  arr2[i]=0;
		for(int i=0;i<len;i++)
		   System.out.print(arr2[i]+" ");

		}

}
