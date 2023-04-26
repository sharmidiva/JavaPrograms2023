package OOPSConcepts;

public class ConDemo {
 public ConDemo() {
		System.out.println("I am inside constructor");
		System.out.println("I am inside constructor11");
	}
 public ConDemo(int a,int b) {
	 System.out.println("I am inside parametrized constructor");
 }
 public String ConDemo(String str) {
	 return str;
 }
 
	public void getData() {
		System.out.println("Getting the data");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo cd=new ConDemo();
		ConDemo cd1=new ConDemo(4,6);
		//ConDemo cdstr=new ConDemo("hello");
		cd.getData();

	}

}
