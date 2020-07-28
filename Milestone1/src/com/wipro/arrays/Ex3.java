package com.wipro.arrays;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No.of elements");
		int n=s.nextInt();
		System.out.println("Enter Elements into Array");
         int arr[]=new int[n];
         int c=0;
         for(int i=0;i<n;i++)
         {
        	 arr[i]=s.nextInt();
         }
         System.out.println("Enter element to search");
         int search=s.nextInt();
         s.close();
         for(int i=0;i<n;i++)
         {
        	 if(arr[i]==search) {
        		 c=c+1;
        		 System.out.println(i);
        		 break;
        	 }
         }
         if(c==0)
        	 System.out.println("-1");
         

	}
}
