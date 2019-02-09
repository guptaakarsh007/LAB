package com.capgemini.lab7_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.List;
public class Replaced {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s1 string");
		String s1=sc.nextLine();
		System.out.println("enter s2 string");
		String s2=sc.nextLine();
		List<String> li=new ArrayList();
		String s3="";

		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
				s3=s3+s2;
			else
				s3=s3+s1.charAt(i);
		}
		li.add(s3);
		System.out.println(li);
		StringBuffer bf=new StringBuffer(s3);
		if(bf.indexOf(s2)==bf.lastIndexOf(s2))
		{
			
		}
		else
		{
			StringBuffer bf1=new StringBuffer(s2);
		
			bf1=bf.replace(bf.lastIndexOf(s2),bf.lastIndexOf(s2)+s2.length(),bf1.reverse().toString());
		}
		}
		
		
	}

	


