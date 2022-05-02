package com.wipro.technical.exam.reverse.string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Reverse String
		 String name =  "madam";
		 String name2 = "";
		 for(int i = name.length()-1; i >= 0;i--) {
			 
			 System.out.println(name.charAt(i));
			 name2 = name2+name.charAt(i);
			 
			
		 }
		
		 System.out.println(name2);
		 
		 if(name.equals(name2)) {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
			 
		 }
	}

}
