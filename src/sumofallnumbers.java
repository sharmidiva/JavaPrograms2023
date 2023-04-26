import java.util.Scanner;

public class sumofallnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of all "+n +" numbers=" +sum);
		System.out.println("Enter the number to check +ve or -ve is=");
		Scanner scn1 = new Scanner(System.in);
		double n1 = scn.nextInt();
		if(n1<0.0) {
			System.out.println(n1 + "is -ve number");
			
		}
		else
		{
			System.out.println(n1 + "is +ve number");
		}

	}

}
