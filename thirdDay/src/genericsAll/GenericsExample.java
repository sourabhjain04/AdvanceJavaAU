package genericsAll;

class Box<T> {
	private T value;

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}
}

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox = new Box<>();
		
		intBox.set(10);
		System.out.println(intBox.get());
		
		Box<String> stringBox = new Box<>();
		stringBox.set("Vedika");
		System.out.println(stringBox.get());

	}

}
