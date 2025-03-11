package secondDay;

class Task extends Thread{
	
	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("Task Executed: "+Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}




public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Task t1 = new Task();
		Task t2 = new Task();
		
		t1.start();
		
		t1.join();
		t2.start();
		
		
		
		
	}

}
