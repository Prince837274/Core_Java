package in.co.controlstatment;

public class Testifhellocondition {
public static void main(String[]args) {
	if(args.length==2) {
		System.out.println("Hello"+ args[0]);
	}else {
		System.out.println("Parameter name is required");
	}
}
}
