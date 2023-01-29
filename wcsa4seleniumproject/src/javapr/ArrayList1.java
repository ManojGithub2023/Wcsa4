package javapr;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
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
	System.out.println(a.remove(2));
	//System.out.println(a.remove('a'));
	System.out.println();
	
	ArrayList b=new ArrayList();
	b.add(2);
	a.add(345);
	a.add("hello");
	b.add(4.45);
	System.out.println(b);
	b.add(a);
	System.out.println(b);
	b.addAll(a);
	System.out.println(b);
	b.retainAll(a);
	System.out.println(b);
}
}
