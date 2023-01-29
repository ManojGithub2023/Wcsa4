package javapr;

import java.util.ArrayList;

public class ArrayList3 {
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
	
	
	ArrayList b=new ArrayList();
	b.add(2);
	b.add(345);
	b.add("hello");
	b.add(4.45);
	System.out.println(b);
	b.removeAll(a);
	System.out.println(b);
	a.retainAll(b);
	System.out.println(a);
}
}
