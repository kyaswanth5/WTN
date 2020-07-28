package com.wipro.arrays;

public class Ex2 {
	public static void main(String[] args) {

		int arr[]= {13,34,78,42,23};
		int min,max;
		max=MaxOfArray(arr);
		min=MinOfArray(arr);
		System.out.println("Maximum of Array : "+max+" Minimum of Array : "+min);
		
	}
	public static int MaxOfArray(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int MinOfArray(int[] arr) 
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}
