package collectionAll;

import java.util.Iterator;
import java.util.Vector;

public class ExampleIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Integer i =(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else
				itr.remove();
		}
	System.out.println(v);
		
	}

}
