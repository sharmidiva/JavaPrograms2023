
public class trycatch {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		
		String[] s= {"abc","123",null};
		for(int i=0;i<6;i++) {
			try {
				int a =s[i].length()+Integer.parseInt(s[i]);
				System.out.println("this will run in try");
				
			}
			catch(Throwable ex) {
				System.out.println("Normal Exceptipn");
			}
		}

	}

}
