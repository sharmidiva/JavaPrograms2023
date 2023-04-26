import java.util.Scanner;

public class checkleapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enetr the year=");
  Scanner scn=new Scanner(System.in);
  year=scn.nextInt();
  if((year%4==0)&&(year%100!=0)) {
	  System.out.println(year +"is a leap year");
  }
  else {
	  System.out.println(year +"is not  a leap year");

	  
  }
  
  
	}

}
