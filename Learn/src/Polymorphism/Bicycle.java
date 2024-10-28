package Polymorphism;

public class Bicycle {
	
	protected int speed;
	protected int gear;
	
	public Bicycle(int startspeed, int startgear) //don't give return type to constructor.
	{
		speed = startspeed;
		gear = startgear;
	}
	public void setGear(int newValue)
	{
		this.gear = newValue;
	}
	
	public int SpeedUp(int increment) {
		return speed += increment; 
	}
	
	public int applyBreak(int decrement)
	{
		return speed -= decrement; 
	}
	
}
