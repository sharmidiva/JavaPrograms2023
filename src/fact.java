import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +n + "is"  +fact);

	}

}
