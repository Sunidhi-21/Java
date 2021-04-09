
public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int n=322,r,rev=0;
		int num=n;
		
		while(n!=0)	{
		r=n%10;
		n=n/10;
	
		rev=rev*10+r;
		}
		if(num==rev)
			System.out.println("the number is palindrome");
		else
			System.out.println("the number is not palindrome");

}
}