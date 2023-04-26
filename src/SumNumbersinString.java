
public class SumNumbersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String str1 = "aa123bb656";
	        
	        char[] c = str1.toCharArray();
	        int sum = 0;
	        for (int i = 0; i < c.length; i++) {
	            if (Character.isDigit(c[i])) {
	                System.out.println("Digits in the String : " + c[i]);
	                int a = Character.getNumericValue(c[i]);
	                sum = sum + a;
	            }
	        }
	        System.out.println("Sum of Digits is : " + sum);
	    
	 

	}//main

	}//class
