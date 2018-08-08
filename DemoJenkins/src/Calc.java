
public class Calc {

	//This method computes addition of two integers
	public int add(int d, int e) {
		return d + e;
	}
	
	//This method computes subtraction of two integers
	public int subs(int x, int y){
		if(x > y){
			return x - y;
		} else {
			return y - x;
		}
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
}
