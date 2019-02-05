package com.cg_vip.lab4;

import java.util.HashMap;
import java.util.Map;

public class MapArray
{
	Map<Integer,Integer> m = new HashMap<>();
	Map square(int a[])
	{
		for(int b:a)
		{
			m.put(b, b*b);
		}
		return m;
	}
}
