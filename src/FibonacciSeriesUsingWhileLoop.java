
public class FibonacciSeriesUsingWhileLoop {

	public static void main(String[] args) {
		
		int n = 10, temp1 = 0, temp2 = 1;
        System.out.print("First " + n + " terms: ");
        
        int i = 1;

        while(i <= n)
        {
            System.out.print(temp1 + " ");

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
            
            ++i;
        }
	}
}
