package AnonymousInnerClass;

public class MountainBike implements Bicycle {
	
	@Override
	public void canApplyBreak() {
		
		System.out.println("Cant canApplyBreak");
		
	}
	
	@Override
	public void canSpeedUp() {
		
		System.out.println("Can speedup mountain bike");
	}
	
	

}
