package com.cg_vip.lab2;

import java.util.ArrayList;
import java.util.List;

public class stringCollection 
{
	List<String> l = new ArrayList<>();
	int s2_occur=0;
	int f=0;
	List operations(String s1,String s2)
	{
		StringBuilder s3 = new StringBuilder(s1);
		StringBuilder s4 = new StringBuilder(s2);
		for(int i=0;i<s1.length();i+=2)
		{
			s3.replace(i,i+s2.length(),s2);
		}
		l.add(s3.toString());
		System.out.println(s3);
		StringBuilder s5 = new StringBuilder(s1);
		StringBuilder s6 = new StringBuilder(s2);
		
		for(int j=s1.length()-1;j>s2.length();j-=s2.length())
		{
			if(f==0)
			{
				String s;
				if(s1.length()%2==0)
				{
					s=s1.substring(j-s2.length(),j);
				}
				else
				{
					s=s1.substring(j,j+s2.length());
				}
				
					if(s.equals(s2.toString()))
					{
						
						s6.reverse();
						if(s1.length()%2==0)
						{
							s5.replace(j-s2.length(),j,s6.toString());
						}
						else
						{
							s5.replace(j-s2.length()+1,j+1,s6.toString());
						}
						l.add(s5.toString());
						f=1;
					}
					else
					{
						String s7=s1.toString();
						s7=s1+s2;
						s7=s6.toString();
						l.add(s7);
					}
				}
			}
		

		for(int k=0;k<s1.length();k+=s2.length())
		{

			if(s2.toString().equals(s1.toString().substring(k, s2.length()+k)))
			{
				s2_occur+=1;
			}
		}
		
		StringBuilder s8 = new StringBuilder(s1);
		StringBuilder s9 = new StringBuilder(s2);
		
		if(s2_occur>1)
		{
			s8.replace(0, s2.length(),"");
			l.add(s8.toString());
		}
		
		 return l;
	}
}
