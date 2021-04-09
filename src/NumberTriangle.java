
public class NumberTriangle {

	public static void main(String[] args) {
		
		int l=5;
		
		for(int i=1;i<2;i++)
			{
				while(l>0) 
				{
					for(int k=5;k>=l;k--)
						System.out.print(k);
				System.out.println();
				l--;
				}
			}
	}
}
