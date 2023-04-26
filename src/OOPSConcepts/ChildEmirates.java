package OOPSConcepts;

public class ChildEmirates extends ParentAirCraft{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates ch=new ChildEmirates();
		ch.bodyColor();
		ch.SafetyGuideLines();
		ch.engiene();
		//ChildEmirates ch=new ParentAirCraft();
		
		//ParentAirCraft pa=new ParentAirCraft();
		

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("body color is presented");
		
	}

}
