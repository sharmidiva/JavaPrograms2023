import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int originalnum=n,reversenum=0, remainder;
		while(n!=0){
			remainder=n%10;
			reversenum=reversenum*10+remainder;
			n=n/10;
			
			
			
		}
		System.out.println("Reverse of the number="+reversenum);
		if(originalnum==reversenum)
	 {
			System.out.println( "number is pallindrome");
		}
		else
		{
			System.out.println( "number is not pallindrome");
		}
		

	}

}
