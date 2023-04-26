
public class Helloworld {
	public static void main(String args[]) {
		System.out.println("Hello World");
		int n=1010235,div,remainder;
		int count=0;
		for(int i=0;i<=5;i++) {
		remainder=n%10;//it will give the remainder
		div=n/10;
		//System.out.println("remainder=="+remainder);
		if(remainder==0)
			
		{
			count++;
			//System.out.println("Count of zero's="+count); 
				
			
			
		}

		//System.out.println("after dividing="+div);
		n=div;
		//System.out.println("value="+n);
		}
		System.out.println("Count of zero's="+count); 


	
		
		
		
	}

}
