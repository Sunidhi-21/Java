
public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		int n=6,m;
		
		m=n;
		
		for(int i=m-1; i>=1 ; i--) {
			
			m*=i;
			
		}
			
		System.out.println("The factoial of " + n + " is " +m);
	}
}
