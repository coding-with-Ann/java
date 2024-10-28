package IntrinsicLocksAndSunchronization;

public class MathUtils {
	
	synchronized void getMultiples(int n) {
		
		//When t1.start() gets executed it immediately went to get multiples method which is synchronized so it puts a lock. 
		//Even if t2.start() executes but it can't hold getMultiples method because it is locked and can only be used by t1.start().
		//if we want to lock a block of code not the whole method then we can use synchronized(this) instead of synchronized.
		//Remove synchronized and write synchronized(this) in front the block of code.
		
		//synchronized(this) {   //this synchronized block of code also accessed by one thread at a time.
		for(int i=1; i<=5; i++) {
			
			System.out.println(n*i);
		}
		try {
			Thread.sleep(400);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
//	}

  }
}
