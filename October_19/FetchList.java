package com.junit5;

import java.util.ArrayList;
import java.util.List;

public class FetchList {
	public List<Integer> getIntegerList(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(38);
		list.add(29);
		list.add(10);
		list.add(28);
		list.add(16);
		list.add(82);
		list.add(12);
		
		return list;
	}
}
