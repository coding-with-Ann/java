package IntrinsicLocksAndSunchronization;

public class IntrinsicLocksAndSunchronizationDemo {
	//When one is depositing the money and the other is withdrawing the money then if both are 
	//depositing 500 and withdrawing 500 at the same time then who's is what?
	//If this is handled by two threads then we can't guaranty if one sees 500 as total sum or 1500 or 0 as total sum.
	//To avoid this intrinsic locks and synchronization is used.
	//The idea is when a thread tries to work on a particular object, it basically 
	//takes a lock on that object. Then only the thread which has taken the lock will be 
	//able to access the object and other threads will be forbidden from accessing the object. 

	public static void main(String args[]) {
		
		MathUtils obj = new MathUtils();
		
		Thread1 t1 = new Thread1(obj);
		Thread t2 = new Thread(new Thread2(obj));
		t1.start();
		t2.start();
	}
}
