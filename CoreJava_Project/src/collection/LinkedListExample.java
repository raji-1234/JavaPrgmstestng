package collection;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Names = new LinkedList<>();
		Names.add("Rajeshwari");
		Names.add("Anvita");
		Names.add("Debajyoti");
		System.out.println(Names);//To Print
		System.out.println(Names.size());
		System.out.println(Names.get(0));
		System.out.println(Names.remove(0));
		System.out.println(Names);//To Print
		Names.add("Rajeshwari");
		Names.add("Anvita");
		Names.add("Debajyoti");
		System.out.println(Names);//To Print
		Collections.sort(Names);
		System.out.println(Names);
	}

}
