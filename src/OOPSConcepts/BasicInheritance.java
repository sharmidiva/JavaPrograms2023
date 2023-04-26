package OOPSConcepts;


	class A{
	
		int i=20;
		
	}
	class B extends A{
		int i=10;
		
	}
	public class BasicInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();
		B bobj=new B();
		System.out.println(obj.i);
		System.out.println(bobj.i);
		
		

	}//main
}


