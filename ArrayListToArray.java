package com.demo.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	
	int i;
	

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(600);
		list.add(40);
		
		Object [] object=list.toArray();
		
		for (Object obj : object) {
			
			System.out.println(obj);
			
		}

	}

}
