package secondDay;

class MutiTasking extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}




public class MultiThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MutiTasking t1 = new MutiTasking();
		MutiTasking t2 = new MutiTasking();
		
		t1.start();
		t2.start();

	}

}
