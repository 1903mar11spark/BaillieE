package com.revature.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.revature.comparison.KayakLengthCompare;
import com.revature.transport.Kayak;

public class Friday {
	
	public static void main(String[] args) {
		
		List<Kayak> kayakList = new ArrayList<>();
		kayakList.add(new Kayak(7.2, "green"));
		kayakList.add(new Kayak(2.4, "red"));
		kayakList.add(new Kayak(2.0, "green"));
		kayakList.add(new Kayak(5.2, "blue"));
		
		
		//anon inner class //fine in the main method -- to define comparison by name
		Comparator<Kayak> ck = new Comparator<Kayak>() {
			@Override
			public int compare(Kayak k1, Kayak k2) {
				
				return k1.getColor().compareTo(k2.getColor());
			}
		};

		sortWithComparator(kayakList, ck);
	}

	static void sortWithComparable(List<Kayak> k1) {
		//we are invoking the collections .sort method
		Collections.sort(k1);
		for (Kayak k: k1) {
			System.out.println(k);
		}
	}
	
	static void sortWithComparator(List<Kayak> k1, Comparator<Kayak> c) {
		
		Collections.sort(k1);
		for (Kayak k: k1) {
			System.out.println(k);
		}
	}
}
