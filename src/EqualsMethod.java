
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HELLO";
		String s2="HELLO";
		String s3=new String("HELLO");
		System.out.println(s1==s2);//it will check for the address
		System.out.println(s1==s3);
		System.out.println("s1 quals method s2="+s1.equals(s2));//it will check the value alone
		System.out.println("s1 quals method s3="+s1.equals(s3));
		
		String str="sharmila";
		System.out.println("given string="+str);
		System.out.println("=======");
		for(int i=0;i<str.length();i++) {
			System.out.println("string["+i+"]="+str.charAt(i));
			
		}//for
		
		String str2="helloworld";
		char[] carray=str2.toCharArray();
		System.out.println("given string="+str2);
		System.out.println("=======");
		for(int i=0;i<str2.length();i++)
		for(int j=i+1;j<str2.length();j++){
			if(carray[i]==carray[j]) {
				System.out.print(carray[j]+" ");
				break;
				
			}//if
		}//for j
	}//fori
			
		
	/*	int[] a=new int[] {1,2,30,4,5};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}//if
		}//for
		System.out.println("largest="+max);*/

		


}



