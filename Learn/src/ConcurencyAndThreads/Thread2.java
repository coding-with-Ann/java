package ConcurencyAndThreads;

public class Thread2 implements Runnable {
// Runnable has only one method which is run.
//The reason java provides two ways of creating thread is, Java doesn't support multiple inheritance,
//so we can use implements along with extends from super class to avoid that problem.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread2 is running");
			
		}catch(Exception e) {
			
			System.out.println("Exception is caught");
		}
		
	}
}
