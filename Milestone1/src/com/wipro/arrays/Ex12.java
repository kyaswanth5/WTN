package com.wipro.arrays;
import java.util.*;
public class Ex12 {
	public static void main(String[] args) {

	    int[] a= {1,2,3};
		int[] b= {4,5,6};
		System.out.println("Array1: "+Arrays.toString(a)); 
		System.out.println("Array2: "+Arrays.toString(b)); 
	    int[] a_new = {a[1], b[1]};	
		System.out.println("New Array: "+Arrays.toString(a_new)); 

	}
}
