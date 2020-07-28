package com.wipro.flowcontrolstatements;

public class Ex8 {
	public static void main(String[] args) {

		String str=args[0];
		char ch=str.charAt(0);
		switch(ch){
		  case 'R':
		   System.out.println("R->RED");
		   break;
		 case 'B':
		   System.out.println("B->BLUE");
		   break;
		 case 'G':
		  System.out.println("G->GREEN");
		  break;
		 case 'O':
		  System.out.println("O->ORANGE");
		  break;
		  case 'Y':
		   System.out.println("Y->YELLOW");
		   break;
		   case 'W':
		   System.out.println("W->WHITE");
		   break;
		   default:
		   System.out.println("Invalid code");
	     }
	}
}
