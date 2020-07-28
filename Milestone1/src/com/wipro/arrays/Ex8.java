package com.wipro.arrays;

public class Ex8 {
	public static void main(String[] args) {
		
	     int arr[]= {10,3,6,1,2,7,9};
	     int len=arr.length;
	   
	int s=0;
	a:
	for(int i=0;i<len;i++)
	{
	if(arr[i]==6){
	for(int j=i+1;j<len;j++){
	 if(arr[j]==7){
	i=j;
	  continue a;
	}
	}
	}
	  s+=arr[i];
	}
	   System.out.print(s);

	}
}
