package Interfaces;

//Interface is a keyword in java which defines the specifications of how a class would act.
//Interfaces can only contain constants, method declarations,default methods static methods and nested types.
//In interfaces you can only declare methods, declare constants cannot define methods.
//You can define a particular type of method using the default keyword but use it in special circumstances.
public class Interfaces {
	
	public static void main(String[] args) {
		
		Mountain_Bike mountainBike = new Mountain_Bike(20,10,1);
		
		
		System.out.println(mountainBike.getSeatHeight());
		mountainBike.applyBrake(1);
		System.out.println(mountainBike.getSpeed());
	}

}
