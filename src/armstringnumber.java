import java.util.Scanner;

public class armstringnumber {

	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		scn = new Scanner(System.in);
		int n = scn.nextInt();
		int originalnum=n,remainder,armstrongno=0;
		while(originalnum!=0) {
			remainder=originalnum%10;
			armstrongno=(int) (armstrongno+Math.pow(remainder, 3));
			originalnum=originalnum/10;
		}
		if(armstrongno==n) {
			System.out.println(n + " is armstrong number");
			}
		else {
			System.out.println(n +"  is not armstrong number");
		}

	}

}
