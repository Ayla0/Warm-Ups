package main;

import java.util.ArrayList;
import java.util.List;

import functions.SortAndMerge;
import functions.SortList;

public class Main {

	public static void main(String[] args) {
		
		SortAndMerge x = new SortAndMerge();
		
		List<Object> l1 = new ArrayList<>();
		l1.add("d");
		l1.add("g");
		l1.add("c");
		l1.add("a");
		l1.add("f");
		
		List<Object> l2 = new ArrayList<>();
		l2.add("d");
		l2.add("e");
		l2.add("h");
		l2.add("b");
		l2.add("f");
		
		x.addList(l1);
		x.addList(l2);
		System.out.println(x.getList());
		
		List<String> l3 = new ArrayList<>();
		l3.add("d");
		l3.add("b");
		l3.add("c");
		l3.add("a");
		l3.add("e");
		
		SortList s = new SortList();
		System.out.println(s.sortList(l3));
		
	}
	
}
