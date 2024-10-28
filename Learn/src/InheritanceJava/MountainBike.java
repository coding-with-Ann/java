package InheritanceJava;
public class MountainBike extends Bike {
	
	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear)
	{
		super(startSpeed, startGear);
		seatHeight = startHeight;
		
	}
	public void seatHeight(int newValue)
	{
		seatHeight = newValue;
	}
    public static void main(String[] args)
    {
    	MountainBike mountainbike = new MountainBike(1,10,2);
    	System.out.println("The applied gear is " +mountainbike.gear);
    	System.out.println("The applied speed is " + mountainbike.speed);
    	System.out.println("The seatHeight is " + mountainbike.seatHeight);
    	mountainbike.applyBreak(1);
    	
    	System.out.println("The speed after applying brake is "+mountainbike.speed );
    	
    }
}
