package secondDay;


class  Counter {
	int count = 0;
	synchronized void increment() {
		count++; // not synchronized , can cause incorrect result
	}
	
}
public class NoSyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()->{
			for (int i=0; i<1000;i++)counter.increment();
		});
		
		Thread t2 = new Thread(()->{
			for (int i=0; i<1000;i++)counter.increment();
		});
	
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Count : "+counter.count);

	}

}
