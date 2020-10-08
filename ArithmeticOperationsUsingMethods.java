public class ArithmeticOperationsUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		System.out.println("Arithmetic Operations");
		
		ArithmeticOperationsUsingMethods add = new ArithmeticOperationsUsingMethods();
		int sum = add.Addition(a,b);
		System.out.println("the sum of "+a+" & "+b+" is "+sum);
		
		ArithmeticOperationsUsingMethods sub = new ArithmeticOperationsUsingMethods();
		int diff = sub.Subtraction(a,b);
		System.out.println("the difference of "+a+" & "+b+" is "+diff);
		
		
		ArithmeticOperationsUsingMethods mul = new ArithmeticOperationsUsingMethods();
		int pro = mul.Multiplication(a,b);
		System.out.println("the product of "+a+" & "+b+" is "+pro);
		
		ArithmeticOperationsUsingMethods div = new ArithmeticOperationsUsingMethods();
		int quo = div.Division(a,b);
		System.out.println("the quotient of "+a+" & "+b+" is "+quo);
		
		ArithmeticOperationsUsingMethods mod = new ArithmeticOperationsUsingMethods();
		int rem = mod.Modulus(a,b);
		System.out.println("the remainder of "+a+" & "+b+" is "+rem);
	}
	
	public int Addition(int a,int b) {
		int sum = a+b;
		
		return sum;
	}
	public int Subtraction(int a,int b) {
		int diff = a-b;
		
		return diff;
		
	}
	public int Multiplication(int a,int b) {
		int pro = a*b;
		
		return pro;
	}
	public int Division(int a,int b) {
		int quo = a/b;
		
		return quo;
	}
	public int Modulus(int a,int b) {
	int rem = a%b;
	
	return rem;
	}
}
