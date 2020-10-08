
public class GreatestOfThreeNumbersUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestOfThreeNumbersUsingMethods gre = new GreatestOfThreeNumbersUsingMethods();
		int a=10,b=20,c=30;
		System.out.println("The nos are: "+a+" "+b+" "+c+" ");
		
		gre.greatestNumber(a,b,c);
		
	
	}
	public void greatestNumber(int a,int b,int c) {
		
		if(a>b && a>c)
			System.out.println("the greatest:" +a);
		else if(b>a && b>c)
			System.out.println("the greatest:" +b);
		else 
			System.out.println("the greatest:" +c);	
	}
}
