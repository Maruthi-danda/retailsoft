package com.id.retailsoft.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(23);
		list.add(10);
		list.add(2);
		list.add(32);
		
		list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(x->System.out.println(x));;
		
		
		
		
		
		
	}

}
