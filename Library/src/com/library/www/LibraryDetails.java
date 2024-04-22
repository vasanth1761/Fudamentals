package com.library.www;

public class LibraryDetails {

	
	public void libraryoutput(String userName)
	{   
		System.out.println("-------WELCOME-------");
		System.out.println("HI : " + userName);

	}
	public void libraryoutput(int libraryid)
	{
		System.out.println("Library id : "+libraryid);
	}
	public void libraryoutput(long phonenumber)
	{
	    System.out.println("ph: "+phonenumber);
	}
    public void libraryoutput(String bookname,int days)
    {
	  System.out.println("Book name: "+bookname);
	  System.out.println("---GREAT BOOK---");
    }
    public void libraryoutput(int days,long phonenumber)
    {
   	   System.out.println("NO of Days: "+days);
    	if(days<=10)
    	{ 
    		System.out.println(" YOU CAN TAKE A BOOK");
    		System.out.println("----THANK YOU----");
    	}
    	
    }
}
