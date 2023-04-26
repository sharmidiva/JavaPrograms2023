package OOPSConcepts;

public class InterfaceEx implements CentralTraffic,StateTraffic{
	//interface is a class and its methods will not have any body.
	//it will not have body implementation
	//only in class all the methods can define and implement methods


	public static void main(String[] args) {
		
		CentralTraffic ct=new InterfaceEx();
		
		ct.greenGo();
		ct.RedStop();
		ct.YelloWait();
		
		StateTraffic st=new InterfaceEx();
		st.TrainRules();
		
		InterfaceEx inex=new InterfaceEx();
		inex.WalkingSymbol();
		//inex.greenGo();
		//inex.greenGo();
		
		
	}
	public void WalkingSymbol()
	{
		System.out.println("Riles for walk signal");
	}
	@Override
	
	public void greenGo() {
		System.out.println("green should go from interf");
		
	}

	@Override
	public void RedStop() {
		System.out.println("red should stop");

		
	}

	@Override
	public void YelloWait() {
		System.out.println("yellow should wait");

	}
	@Override
	public void TrainRules() {
		System.out.println("train symbol");
	}

}
