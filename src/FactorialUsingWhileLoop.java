
public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		
		int n=6,m;
		
		m=n;
		
		int i=m-1;
		
		while(i>=1) {
			
			m*=i;
			i--;
			
		}
			
		System.out.println("The factoial of " + n + " is " +m);
	}
}
