package com.cg_vip.lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("Rahul");
		list1.add("Mahuol");
		list1.add("Mahua");
		list1.add("Arasdk");
		list1.add("Bsdkjhjf");
		list1.add("Plsosdj");
		
		list2.add("Mahuol");
		list2.add("Bsdkjhjf");
		list2.add("Plsosdj");
		
		RemList l = new RemList();
		System.out.println(l.remList(list1, list2));
		
	}

}
