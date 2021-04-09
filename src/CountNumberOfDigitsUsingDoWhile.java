
public class CountNumberOfDigitsUsingDoWhile {
	
	public static void main(String[] args) {
		
		int count = 0, num = 342;

        do{
            num /= 10;
            count++;
        }while(num != 0);

        System.out.println("Number of digits: " + count);
	}

}
