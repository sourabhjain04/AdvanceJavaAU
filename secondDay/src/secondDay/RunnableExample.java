package secondDay;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running "+ Thread.currentThread().getName());
	}
	
}



public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new MyRunnable());
		
		t1.start();
	}

}
