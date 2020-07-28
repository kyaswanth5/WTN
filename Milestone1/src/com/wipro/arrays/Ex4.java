package com.wipro.arrays;

public class Ex4 {
	public static void main(String[] args) {
		int num[] = {65,56, 78, 49, 95};
        String str =null;
        for(int i:num){
            str = Character.toString((char)i);
            System.out.print(str+"\t");
        }
	}
}
