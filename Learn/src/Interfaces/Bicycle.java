package Interfaces;
//interfaces example
public interface Bicycle {
	
	//In interfaces you can only declare methods but cannot define.
	//Interfaces are only for contracts or specifications
	//whereas in abstract classes you can write concrete behavior(method implementation) as well
	
	void speedUp(int increment);
	void applyBrake(int decrement);

}
