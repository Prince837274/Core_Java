package in.co.basics;

import in.co.controlstatment.Test;

public class Test1in3 {
public static void saysomething () {
	System.out.println("hello world");
}
public static int  Multiply(int a,int b) {
	return a*b;

}
public static void add () {
	int a=50;
	int b=40;
	System.out.println ("Add:"+(a+b));
}
public static void main(String[]args) {
	Test1in3 t=new Test1in3 ();
	t.add();
	t.saysomething();
	System.out.println(t.Multiply(30,50));
	
	
}
}
