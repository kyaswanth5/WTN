package com.wipro.arrays;

public class Ex14 {
	public static void main(String args[]){
		int a=args.length;
		    int x,y,w,z,i;
		    int arr[][] = new int[9][9];
		    if(a<9){
		    System.out.println("Please enter 9 integer values");
		    }
		    if(a==9){
		      int k=0;
		    for(i=0;i<3;i++){
		        for(int j=0;j<3;j++){
		        	arr[i][j]=Integer.parseInt(args[k]);
		        k++;
		        }}
		System.out.println("The given array is :");
		    for(i=0;i<3;i++){
		        for(int j=0;j<3;j++){
		        System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		        }
		int max = arr[0][0];
		        for (i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                if (arr[i][j] > max) {
		                    max = arr[i][j];
		                }
		            }
		        }
		System.out.println("The biggest number in the given array is "+max);
		}
		}
}
