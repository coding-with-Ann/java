package Polymorphism;

//For method overriding

public class MountainBike extends Bicycle {
	int seatheight;
	
	public MountainBike(int startspeed, int startheight, int startgear)
	{
		super(startspeed,startgear);
		seatheight = startheight;
		
	}
	
	public void setHeight(int newValue)
	{
		this.seatheight = newValue;
	}
	
	@Override
	public void setGear(int newValue)
	{
		this.gear = newValue+2;
	}
	
	@Override
	public int SpeedUp(int increment) {
		return speed = speed + increment+10; 
	}
	
	@Override
	public int applyBreak(int decrement)
	{
		return speed = speed - decrement-10; 
	}
	 
	

}
