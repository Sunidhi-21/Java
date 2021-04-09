
public class SumOfNaturalNosUsingWhileLoop {
	
	public static void main(String[] args) {
		
		int sum=0,i=5;
		
		while(i <= 25) {
			
			sum = sum + i;
			
			i++;
		}
		System.out.println("The sum of natural nos between 5 to 25 is: " +sum);
		
	}

}
