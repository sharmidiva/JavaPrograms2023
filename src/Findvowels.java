
public class Findvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcomee";
		int slen=str.length();
		int n=str.length()/2;
		String substr1=str.substring(0, n);
		String substr2=str.substring(n,slen );
		
		
				System.out.println("lenghth of substr1="+n);
				System.out.println("substring1="+substr1);
				System.out.println("lenghth of substring2="+n);
				System.out.println("Substring2="+substr2);
		int count=0;
		for(int i=0; i<str.length(); i++) {
		      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
		          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
		          str.charAt(i) == 'u') {
		        
		        System.out.println("Given string contains vowel " + 
		            str.charAt(i)+" at the index " + i);
		      count++;
		      }//if

		    }//for
		System.out.println("no of vowels="+count);



	}//main method

}
