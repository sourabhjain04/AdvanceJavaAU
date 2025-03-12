package javaBestPractices;

public class SingletonDP {

	private static SingletonDP instance;
	private SingletonDP() {}
	public static SingletonDP getInstance() {
		if (instance == null) {
			instance = new SingletonDP();
			
		}
		return instance;
		
	}
	
}






