public class CountNumberOfDigits {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("start");
			
			CountNumberOfDigits number = new CountNumberOfDigits();
			
			int n=2367385;
			int count = number.noOfDigits(n);
			
			System.out.println("Number of digits in " +n+ " is " +count);
			
			System.out.println("end");
		}
		
		public int noOfDigits(int num) {
			
			int count=0;

	        do{
	            num /= 10;
	            count++;
	        }while(num != 0);

	        return count;
		}
	}




