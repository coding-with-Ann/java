package InheritanceJava;

public class Bike {
	
	protected int speed;
	protected int gear;
	
	public Bike(int startSpeed, int startingGear)
	{
	  speed = startSpeed;
	  gear = startingGear;
	}
	public void applyGear(int newValue)
	{
		gear = newValue;
	}
	public void speedUp(int increment)
	{
		speed += increment;
	}
	public void applyBreak(int decrement) {
		
		speed-= decrement;
	}
}
