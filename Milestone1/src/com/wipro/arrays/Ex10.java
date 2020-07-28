package com.wipro.arrays;

public class Ex10 {
	public static void main(String[] args) {
		int arr[]= {1,0,1,0,0,1,1};
		int len=arr.length;
		int k=0;
		int c=len-1;
		int [] arr2= new int[len];
		for (int i = 0; i < len; i++) {
		    if(arr[i] % 2 == 0) {
		      arr2[k] = arr[i];
		      k++;
		    } 
		    else {
		      arr2[c] = arr[i];
		      c--;
		    }
		  }
		for(int i=0;i<len;i++)
		   System.out.print(arr2[i]+" ");
		}
}
