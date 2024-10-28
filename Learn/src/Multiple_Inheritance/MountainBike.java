package Multiple_Inheritance;

public class MountainBike extends Twowheelers implements Bicycle1,Vechile {
	int speed;
	int gear;
	int seatheight;
	
	public MountainBike(int startspeed, int startgear, int startheight)
	{
		speed = startspeed;
		gear = startgear;
		seatheight = startheight;
	}
	public int speedUp(int increment) {
		speed += increment;
		return speed;
	}
	
	public int applyBreak(int decrement)
	{
		speed -= decrement;
		return speed;
	}
	
	
	public void canDrive() {
		System.out.println("MountainBike1 can be driven");
	}

}
