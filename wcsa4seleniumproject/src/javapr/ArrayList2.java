package javapr;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(123);
		a.add('a');
		a.add("java");
		a.add(true);
		a.add('b');
		a.add(4.45);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.contains("java"));
		//System.out.println(a.remove(2));
		System.out.println(a.removeAll(a));
		System.out.println(a);
	}

}
