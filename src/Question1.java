
public class Question1 {

	public static void main(String[] args) {
		
		int arr[] = {3,9,2,5,6,7};
		
		int k=11;
		
		System.out.println("The input array elements: ");
		for(int i=0; i<arr.length;i++) {	
			System.out.println(arr[i]);
		}
		
		System.out.println("the input key: "+k);
		
		Question1 question1 = new Question1();
		int result[]=question1.findPair(arr, k);
		
		System.out.println("The first pair in the array whose sum matches the key is: ");
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

	int[] findPair(int arr[],int k) {
		
		int[] arr2 = new int[2];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					arr2[0]=arr[i];
					arr2[1]=arr[j];
					break;
				}
				
			}
			
		}
		
		return arr2;
	}
}
