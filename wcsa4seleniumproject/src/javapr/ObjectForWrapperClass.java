package javapr;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ObjectForWrapperClass {
public static void main(String[] args) {
	Integer a = new Integer(100);
	System.out.println(a);
	Integer a1=200;
	System.out.println(a1);
	
	Byte b=new Byte((byte) 12);
	System.out.println(b);
	Byte b1=11;
	System.out.println(b1);
	
	Short s=new Short((short) 54);
	System.out.println(s);
	Short s1=45;
	System.out.println(s1);
	
	Double d=new Double(12.34);
	System.out.println(d);
	
}
}
