
public class Question2 {

	public static void main(String[] args) {
		
		String str = "aasdvasvavda";
		
		Question2 question2 = new Question2();
		question2.printOccurence(str);
	}
	
	void printOccurence(String str) {
		System.out.println("The first occurence of the chars: ");
		System.out.println(str.substring(1, 5));
	}
}
