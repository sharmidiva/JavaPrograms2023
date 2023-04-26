
public class hellowor {
	public static void main(String[] args) {
        //System.out.println("Hello, World!");
        System.out.println(reverseString("Hello, World!"));
        
    }
    
    
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        
        for(int i=0; i < len/2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - 1 -i];
            chars[len - 1 -i] = temp;
        }
        
        return chars.toString();
        
        
    }
}
