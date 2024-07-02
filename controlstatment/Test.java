package in.co.controlstatment;

public class Test {
public static void saysomething () {
	System.out.println ("hello world");
}
public static void sum() {
	int a=20;
	int b=40;
	System.out.println ("sum:="+(a+b));
}
public static int sub (int a,int b) {
	return a-b;
}
public static void main (String []args) {
	Test t=new Test ();
	t.saysomething ();
	System.out.println(Test.sub(50,40));
	t.sum ();
	
}
}
