public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Begin prog");
		
		PrimeNumber prime = new PrimeNumber();
		
		prime.primeNo(123);
		
		System.out.println("End prog");
	}

	public void primeNo(int num) {
		
		System.out.println("the given no is "+num);
		
		 int i,m=0,flag=0;    
		 
		  m=num/2;      
		  
		  if(num==0||num==1){  
			  
		   System.out.println(num+" is not prime number");
		   
		  }
		  else{ 
			  
		   for(i=2;i<=m;i++){ 
			   
			 if(num%i==0){     
		    	
		       System.out.println(num+" is not prime number");      
		       flag=1;
		       break;
		    } 
		    
		   } 
		   if(flag==0)  {
			   
			   System.out.println(num+" is prime number"); }  
		  }
		  
	}
}
