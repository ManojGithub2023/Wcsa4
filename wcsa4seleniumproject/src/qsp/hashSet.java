package qsp;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add(4);
		h.add(3);
		h.add("sdf");
		h.add('s');
		h.add(3);
		System.out.println(h);
		ArrayList a = new ArrayList(h);
		Collections.sort(a);
		System.out.println(a);

	}

}
