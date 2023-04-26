
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="abc tech";
		int len=str.length();
		System.out.println("length of the string="+len);
		System.out.println("String x="+str);
		for(int i=0;i<str.length();i++)
		{
		System.out.println("Char at index["+i+"]="+str.charAt(i));
		}*/
		
		String x="Abc tech";
		//String str="data";
		x=x.concat("\0");
		char y[]=x.toCharArray();
		//System.out.println("after concating null="+x.concat(str));
		int count=0,i=0;
		while(y[i]!='\0'){
			count++;
			i++;
			
		}
		System.out.println("count="+count);
		
		

	}

}
