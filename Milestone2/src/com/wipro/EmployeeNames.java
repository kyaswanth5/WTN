package com.wipro.Hashset;
import java.util.HashSet;
import java.util.Iterator;
public class EmployeeNames {
	public static void main(String[] args) {
		HashSet<String> group = new HashSet<>();

		group.add("yaswanth");
		group.add("chandu");
		group.add("sai");
		group.add("kiran");

		Iterator<String> it = group.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}
