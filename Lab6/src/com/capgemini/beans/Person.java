package com.capgemini.beans;

public class Person {
	
	private String firstname;
	private String lastname;
	private char gender;
	
	public Person(String firstname, String lastname,char gender) throws MyException {
		super();
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setGender(gender);
		try
		{
			if(this.getFirstname()==null)
				throw new MyException("First name is blank");
			if(this.getLastname()==null)
				throw new MyException("last name is blank");
			System.out.println("its ok");
		}
		catch(MyException e)
		{
		System.out.println(e);
		}
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
	}
	
	
}
