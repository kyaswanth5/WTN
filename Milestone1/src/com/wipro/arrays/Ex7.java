package com.wipro.arrays;

public class Ex7 {
	public static void main(String a[]){
	    int[] arr1 = {12, 34, 12, 45, 67, 89};
	   		    int j = 0,flag;
	   		    int i = 1;
		   		    while(i < arr1.length){
		        flag=0;
		        for(int k=0;k<i;k++){
		        if(arr1[i] == arr1[k]){
		            flag=1;
		            break;
		        }

		        }
		        if(flag==0)
		        {
		            arr1[++j] = arr1[i];
		        } 
		         i++;
		        }

		    int[] arr2= new int[j+1];
		    for(int k=0; k<arr2.length; k++){
		        arr2[k] = arr1[k];
		    }

		    for(i=0;i<arr2.length;i++)
		    	System.out.print(arr2[i]+" ");
		}
}
