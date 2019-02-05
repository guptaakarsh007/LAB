package com.cg_vip.lab3;

import java.util.ArrayList;
import java.util.List;

public class RemList
{

	
	
    List<String> remList(List<String> list1,List<String> list2)
	{
    	list1.removeAll(list2);
    	return list1;
	}
	
}