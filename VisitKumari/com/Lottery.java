package VisitKumari.com;

import java.util.*;

import VisitKumari.lib.JavaUtils;

public class Lottery {
	public static void main(String[] args) {
		JavaUtils myLottary = new JavaUtils();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Starting Number : ");
		int start = scan.nextInt();
		System.out.print("Enter the Ending Number : ");
		int end = scan.nextInt();
		Integer arr[] = {};
		List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));
		while (arrlist.size() <= end - start) {
			int nextCoupon = myLottary.getRand(start, end);
			if (!arrlist.contains(nextCoupon)) {
				arrlist.add(nextCoupon);
			}
		}
		System.out.print("Coupons : ");
		for (int element : arrlist) {
			System.out.print(element + " ");
		}
		scan.close();
	}
}