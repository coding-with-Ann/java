package ConcurencyAndThreads;

public class Thread1 extends Thread {  
	//To create thread, extend the class using predefined Thread class.
   //This thread class will ask you to override the run method.
	//There are different states in a thread.
	//There is  a thread which states thread is ready, there is also a thread which state thread is running.
	//There is a thread which is waiting for an io input from the user.
	//There is a thread where the thread is sleeping(paused).
	
	@Override
	public void run() //This is to specify what happens when you run the thread.
	{
		try {
			System.out.println("Thread1 is running");
			
		}catch(Exception e) {
			//Throwing an exception
			System.out.println("Exception raised" +e);
		}

	}
	

}
