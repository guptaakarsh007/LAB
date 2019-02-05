package com.cg_vip.lab5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		List<String> a = new ArrayList<>();
		a.add("Ramesh");
		a.add("Mamesh");
		a.add("Suresh");
		a.add("Dinesh");
		a.add("Ganesh");
		a.add("Lasesh");
		ArraySort s = new ArraySort();
		a= s.sort(a);
		System.out.println(a);
		
	}

}
