
public class SumOfDigits {

	public static void main(String[] args) {
		
		int n=125,r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("sum of the digits: " +sum);
	}
}
