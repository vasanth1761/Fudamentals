package com.library.www;
import java.util.*;

public class Mainbody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("->----->-----WELCOME TO THIS PORTAL------<-----<-");
		System.out.println("1.ADMIN or 2.USER or 3.EXIT");
		int adminuser=sc.nextInt();
        while(true) 
        {
            if(adminuser==1||adminuser==2||adminuser==3)	
        {
        switch(adminuser)
		{
		case 1:
	
			System.out.println("------------------------------------------");
			System.out.println("      -----------------------------");
			System.out.println("             ---------------");
			System.out.println("                   ----");
			System.out.println("ADMIN NAME:");
			ValidationMainBody.usernameloginadmin();
            
			System.out.println("ADMIN PASSWORD:");
			ValidationMainBody.passwordloginadmin();
			
			System.out.println("        -------WELCOME ADMIN--------");
			System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK");
			System.out.println("-------------------------------------");
			int adddelete=ValidationMainBody.addbook();
			Loginvalidation.toselectadddelte(adddelete);
	        return;
			
		case 2:
			LibraryVerification.libraryuserportal();
            return;
		case 3:
			 System.out.println("Exited Successfully");
			 System.out.println("1.ADMIN or 2.USER or 3.EXIT");
			 adminuser=sc.nextInt();
		}
		}
        else
        {
        	System.out.println("Select the 1- user or 2-admin");
        	adminuser=sc.nextInt();
        }       
			
	    }

	}
}
