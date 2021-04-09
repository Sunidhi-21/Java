 
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=370,r,sum=0;
		int num=n;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
		}
		
		if(sum==num)	
		System.out.println(num+ " is an armstrong number");
		else
		System.out.println(num+ " is not an armstrong number");
	}
}
