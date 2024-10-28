package Interfaces;

//interfaces example 
public class Mountain_Bike implements Bicycle { 
	
	int seatheight;
	int gear;
	int speed;
	
	public Mountain_Bike(int startheight, int startspeed, int startgear) {
		
		seatheight = startheight;
		seatheight = startheight;
		speed = startspeed;
	}
	
	public int getSeatHeight() {
		return seatheight;
	}
	
	public int getSpeed() {
		return speed;
	}
	
//implements used to extend from the interface
	
	@Override // to tell java that we are overriding applyBrake from main class.
	public void applyBrake(int decrement)
	{
		speed -= decrement; 
	}
	@Override
	public void speedUp(int increment)
	{
		speed += increment;
	}

}
