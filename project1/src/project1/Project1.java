package project1;
import java.io.*;
import java.util.*;
public class Project1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empNo=Integer.parseInt(args[0]);
		int id[]=new int[] {1001,1002,1003,1004,1005,1006,1007};
		String[] empName= new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] joindate = new String[] {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		String[] desgcode=new String[] {"e","c","k","r","m","e","c"};
		String[] dep=new String[] {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int [] basic=new int[] {20000,30000,10000,12000,50000,23000,29000};
		int[] hra=new int[] {8000,12000,8000,6000,20000,9000,12000};
		int [] it=new int[] {3000,9000,1000,2000,20000,4400,10000};
		String designation="";
		int da;
		int salary=0;
		int f=0;
		for(int i=0;i<7;i++){
			if(empNo==id[i])
			{
				f=1;
				System.out.println("Emp No EmpName Department Designation Salary");
		  switch(desgcode[i])
		  {
			case "e": designation="Engineer";
			          da=20000;
			          System.out.println(id[i]+"    "+empName[i]+"     "+dep[i]+"     "+designation+"      "+(basic[i]+hra[i]+da-it[i]));
			          break;
			case "c": designation="Consultant";
	                  da=32000;
	                  System.out.println(id[i]+"    "+empName[i]+"     "+dep[i]+"     "+designation+"      "+(basic[i]+hra[i]+da-it[i]));
	                  break;
			case "k": designation="Clerk";
	                  da=12000;
	                  System.out.println(id[i]+"    "+empName[i]+"     "+dep[i]+"     "+designation+"      "+(basic[i]+hra[i]+da-it[i]));
	                  break;
			case "r": designation="Receptionist";
	                  da=15000;
	                  System.out.println(id[i]+"    "+empName[i]+"     "+dep[i]+"     "+designation+"      "+(basic[i]+hra[i]+da-it[i]));
	                  break; 
			case "m": designation="Manager";
	                  da=40000;
	                  System.out.println(id[i]+"    "+empName[i]+"     "+dep[i]+"     "+designation+"      "+(basic[i]+hra[i]+da-it[i]));
	                  break;
		}
		break;
			}
			else {
				f=0;
			}
	     }
		if(f==0)
		    System.out.println("There is no employee with empid:"+empNo);
		}
	}
