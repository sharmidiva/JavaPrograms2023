
public class TestSpiltMethod {
	public static void main(String[] args) {  
		//declaring and initializing a string  
	      
		String str = "I like cars to play";  
		System.out.println("Given String: "+str);
		//declaring an empty string array  
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = str.split(" ");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++){  
		System.out.println("index["+i +"]"+strArray[i]+",size="+strArray[i].length()); 
	     // System.out.println("Letters: "+count);

		  
		}//for
		 
	     

		}  

}
