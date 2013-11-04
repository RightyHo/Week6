public class Calculator {
	private int x;
	private int y;
	public Calculator(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int add(int x,int y){
		int sum = x + y;
		System.out.println("Addition result: " + sum);
		return sum;
	}
	public int subtract(int x,int y){
		int result = x - y;
		System.out.println("Subtraction result: " + result);
		return result;
	}
	public int multiply(int x,int y){
		int result = x * y;
		System.out.println("Multiplication result: " + result);
		return result;
	}
	public double divide(int x,int y){
		double a = (double) x;
		double b = (double) y;
		double result = a / b;
		System.out.println("Divide result: " + result);
		return result;
	}
	public int modulus(int x,int y){
		boolean finished = false;
		int divisor = 0;
		int remain = x;
		while(!finished){
			if(remain < y){
				finished = true;
				System.out.println("Modulus result: " + remain + " With Quotient: " + divisor);
				return remain;
			} else if(remain / y >= 1 ){
					remain = remain - y;
					divisor++;
			} else {
				finished = true;
				System.out.println("Modulus result: " + remain);
				return remain;
			}
		}
		return remain;
	}
}








