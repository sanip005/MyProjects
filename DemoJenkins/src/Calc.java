
public class Calc {

	public int add(int x, int y) {
		return x + y;
	}
	
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
}
