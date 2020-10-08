
public class ArmstrongNumber {
	public static void main(String[] args) {
		
		ArmstrongNumber arm = new ArmstrongNumber();
		
		int num = 370;
		
		int sum = arm.armstrongNumber(num);
		
		if(sum==num)	
			System.out.println(num+ " is an armstrong number");
			else
			System.out.println(num+ " is not an armstrong number");
		}
	
	
	
	public int armstrongNumber(int n) {
		
		int r,sum=0;
		
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
		}
		return sum;
		
	}
}

