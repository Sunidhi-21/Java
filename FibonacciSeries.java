
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibonacci series");
		FibonacciSeries fibo = new FibonacciSeries();
		
		fibo.fibonacci(10);
		
	}
	public void fibonacci(int n) {
		int temp1=0,temp2=1;
		
		for (int i = 1; i <= n; ++i)
        {
			System.out.print(temp1 + " ");

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
}
}