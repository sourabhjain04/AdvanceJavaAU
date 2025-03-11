package collectionAll;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}



public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Product> productsList =new ArrayList<Product>();
	
	productsList.add(new Product(1,"Hp laptop",25000f));
	productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));
    
    List<Float> productpriceList2 = productsList.stream()
    		.filter(p->p.price>30000)
    		.map(p->p.price)
    		.collect(Collectors.toList());
    
    
    System.out.println(productpriceList2);
    
	
	}

}
