import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		System.out.println("Enter the number=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int a = 0; //0th fibonacci number
		int b = 1; //1st fibonacci number
		System.out.println("Fibonacci till :"+n );
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ,");
			int fib=a+b;
			a=b;
			b=fib;
		}
		

	}
}

		

	


