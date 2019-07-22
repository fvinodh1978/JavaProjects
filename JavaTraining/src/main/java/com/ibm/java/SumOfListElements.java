package com.ibm.java;
import java.util.ArrayList;
import java.util.List;

public class SumOfListElements {
	public List<Integer> getSumOfListElements(List<Integer> first,
			List<Integer> second) {
		Integer []

		// Student code here
		
		return 1;
	}

	public void printSumOfListElements(List<Integer> list1, List<Integer> list2) {
		System.out.println(getSumOfListElements(list1, list2));
	}

	public static void main(String[] args) {
		List<Integer> first = null;
		List<Integer> second = null;

		String input1 = "", input2 = "";
		if (args.length == 1) {
			first = new ArrayList<Integer>();
			input1 = args[0];
		} else if (args.length == 2) {
			first = new ArrayList<Integer>();
			second = new ArrayList<Integer>();
			input1 = args[0];
			input2 = args[1];
		}

		try {
			String[] ar1 = input1.split(",");
			String[] ar2 = input2.split(",");

			if (!input1.trim().equals("")) {
				for (String s : ar1) {
					first.add(new Integer(s.trim()));
				}
			}
			if (!input2.trim().equals("")) {
				for (String s : ar2) {
					second.add(new Integer(s.trim()));
				}
			}

			SumOfListElements obj = new SumOfListElements();
			obj.printSumOfListElements(first, second);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Invalid input/s.");
		}
	}
}
