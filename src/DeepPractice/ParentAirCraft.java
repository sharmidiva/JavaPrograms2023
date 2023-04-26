package DeepPractice;

public abstract class ParentAirCraft {
	
	public void engiene() {
		System.out.println("Follow engine guidelines");
	}
	public void safetyGuidelines() {
		System.out.println("Follow safety guidelines");
	}
	public abstract void bodycolor();//abstract method can't implement the body
    }//abstract class

//abstract methods should always be inside abstarct class

