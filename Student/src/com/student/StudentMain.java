package com.student;

public abstract class  StudentMain {
	public abstract String information();
	public int detail(int id)
	{
		System.out.println("The idis :" +id);
		return 0;
	}
    public String detail(String name)
    {
    	System.out.println("The Student name is:"+name);
    	return null;
    }
    public String detail(String location, String bloodgroup,String degree)
    {
    	System.out.println("The blood group is:"+location);
    	System.out.println("The blood group is:"+bloodgroup);
    	System.out.println("The blood group is:"+degree);
    	return null;
    }
}   
