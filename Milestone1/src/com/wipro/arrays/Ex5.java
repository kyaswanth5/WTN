package com.wipro.arrays;

public class Ex5 {
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7,2};
        int n=arr.length;
		int i, max1, max2, min1, min2;
		max1 = arr[1];
		max2=arr[1];
		min1 = arr[1];
		min2=arr[1];
		for(i=0;i<n; i++){
			if(arr[i]> max1)
				max1 = arr[i];
		}
		for(i=0; i<n; i++){
			if(arr[i]>max2 && arr[i]!=max1)
				max2= arr[i];
		}
		for(i=0;i<n; i++){
			if(arr[i]< min1)
				min1 = arr[i];
		}
		for(i=0; i<n; i++){
			if(arr[i]<min2 && arr[i]!=min1)
				min2= arr[i];
		}
		System.out.println(max1+" "+max2+" "+min1+" "+min2);

	}
}
