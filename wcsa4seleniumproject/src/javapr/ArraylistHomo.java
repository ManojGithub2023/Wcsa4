package javapr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArraylistHomo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);

		a.add(1);
		a.add(4);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		for (Integer a1 : a) {

			System.out.println(a1);
		}
	}

}
