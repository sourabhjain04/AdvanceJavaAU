package collectionAll;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		s.push("A");
		s.push(10);
		s.push("aaa");
		
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
