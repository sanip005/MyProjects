
public class Main {

	public static void main(String[] args) {
		Calc cal = new Calc();
		
		int a = cal.add(4,  5);
		
		int b = cal.subs(5, 4);
		
		int c = cal.multiply(4, 5);
		
		double d = cal.add(5.0, 9.0);
		
		double e = cal.multiply(5.0, 6.0, 7.0);
		
		System.out.println("The result is "+ a);
		System.out.println("The result is "+ b);
		System.out.println("The result is "+ c);
		System.out.println("The result is "+ d);
		System.out.println("The result is "+ e);
	
	}

}
