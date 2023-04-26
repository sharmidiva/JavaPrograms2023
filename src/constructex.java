
public class constructex {
	int id;
	
	constructex(){
		int x=10;
		System.out.println("example for constructor");
	}
	int display() {
		System.out.println("id=="+id);
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructex obj=new constructex();
		obj.display();

	}

}
