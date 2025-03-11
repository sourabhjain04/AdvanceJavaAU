package secondDay;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is Running: "+Thread.currentThread().getName());
	}
}




public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread obj = new MyThread();
		obj.start(); //start the thread
	}

}
