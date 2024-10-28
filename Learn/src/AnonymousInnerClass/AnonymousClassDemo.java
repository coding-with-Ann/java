package AnonymousInnerClass;
//Anonymous inner class
//A class which doesn't have a name is anonymous inner class.

public class AnonymousClassDemo {
	
	public static void main(String args[])
	{
	
//	Bicycle mountainBike = new MountainBike();
//	mountainBike.canSpeedUp();
//	mountainBike.canApplyBreak();
		
	Bicycle bicycle = new Bicycle() {
		
		//ANONYMOUS INNER CLASS IMPLEMENTATION.
		//You can use the interface instantiation if you don't want to use child class of it.
		
		@Override
		public void canSpeedUp() {
			System.out.println("Can speed up mountain Bike");
			
		}
		
		@Override
		public void canApplyBreak() {
			System.out.println("Can applybreak");
			
		}
	};
	bicycle.canSpeedUp();
	bicycle.canApplyBreak();
	
	}
}
