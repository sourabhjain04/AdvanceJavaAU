package secondDay;



class StateDemo extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getState());// Runnable or Timed_Wating
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadStateExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StateDemo t1 = new StateDemo();
		
		System.out.println(t1.getState()); //New
		t1.start();
		Thread.sleep(500);
		System.out.println(t1.getState());// Runnable or Timed_Wating
		
		t1.join();
		System.out.println(t1.getState());// terminated
		
		
	}

}
