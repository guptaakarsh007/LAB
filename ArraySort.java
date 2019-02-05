package com.cg_vip.lab5;

import java.util.Collections;
import java.util.List;

public class ArraySort implements Comparable
{
	List<String> sort(List<String> l)
	{
		
		Collections.sort(l);
		return l;
	}
	@Override
	public int compareTo(Object o)
	{
		if(this.toString().compareTo(o.toString())==0)
		{
			return 0;
		}
		else if(this.toString().compareTo(o.toString())>0)
		{
			return 1;
		}
		else
			return -1;
		
	}
	
}
