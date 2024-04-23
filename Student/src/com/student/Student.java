package com.student;

public class Student extends StudentMain implements UpdatedRules{
	@Override
	public String information() 
	{
		System.out.println("-----PLEASE ENTER THE STUDENT DETAILS BELOW-----");
		return null;
	}
	public void newRules() {
		System.out.println("----THANK YOU FOR DETAILS----");
	}

}