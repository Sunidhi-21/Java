
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n = 10, temp1 = 0, temp2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(temp1 + " ");

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
     }
}