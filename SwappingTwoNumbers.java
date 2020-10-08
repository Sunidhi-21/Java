

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingTwoNumbers swap = new SwappingTwoNumbers();
		
		int num1=3,num2=2;
		swap.swappingNumbers(num1,num2);
	}
    
	public void swappingNumbers(int num1,int num2) {
		
		int	temp;
		
		temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		
	}
}