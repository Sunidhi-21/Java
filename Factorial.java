public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		int fac=fact.factorialOfNumber(6);
		
		System.out.println("the factorial is " +fac);
		
	}
	
	public int factorialOfNumber(int n) {
		
		int m=n;
		
		for(int i=m-1; i>=1 ; i--) {
			
			m*=i;
			
		}return m;
	}

}
