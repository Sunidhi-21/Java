
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Begin prog");
		
		int num=991;
		
		PalindromeNumber pal = new PalindromeNumber();
		
		int res = pal.palindrome(num);
		
		if(res==num)
			System.out.println(num+" is palindrome no");
		else
			System.out.println(num+" is not a palindrome no");
		
		System.out.println("end of prog");
	}

	
	public int palindrome(int num) {
		
		System.out.println("the no is: "+num);
		
		int rev=0,r;
		int n=num;
		
		while(n!=0)	{
		r=n%10;
		n=n/10;
	
		rev=rev*10+r;
		}
		return rev;
	}
}
