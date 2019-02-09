package com.capgemini.lab6_2;

public class Person {
	private String firstname;
	private String Lastname;
	private char gender;
	private int age;
	public Person(String firstname, String lastname, char gender, int age) throws MyException {
		super();
		this.firstname = firstname;
		this.Lastname = lastname;
		this.gender = gender;
		this.age = age;
		try
		{
			if(age<15)
			throw new MyException("age of person should be above 15");	
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		
	}
	
	

}
