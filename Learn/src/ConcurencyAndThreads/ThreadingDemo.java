package ConcurencyAndThreads;

public class ThreadingDemo {
	
	public static void main(String Args[]) {
		
		int n = 10;               //no of threads
		for(int i = 0; i<n ; i++) {
			
			Thread1 t1 = new Thread1();              //******
			t1.start();
			
			Thread t2 = new Thread(new Thread2()); //******
			t2.start();
		}
	}

}
//You wont get output in sequence because threads doesnt run in sequence they run in parallel.
//This is the power of concurrency.
//Which ever thread takes the idal piece cpu is going to execute. 
//That is the reason you see the random threads in output. *********
//We can't guaranty the sequence of execution of threads.
