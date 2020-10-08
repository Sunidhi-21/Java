
public class SquareOfANumberUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareOfANumberUsingMethods sq = new SquareOfANumberUsingMethods();
		int n=2;
		int square=sq.squareOfNumber(n);
		
		System.out.println("square of "+n+" is "+square);

	}
    public int squareOfNumber(int num) {
    	int square=num*num;
    	
    	return square;
    }
}
