package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
	List<String> Names = new ArrayList<>();
	Names.add("Rajeshwari");
	Names.add("Anvita");
	Names.add("Debajyoti");
	System.out.println(Names);//To Print
	System.out.println("The Total number of Names are" + Names.size());//To display the size of the array
	System.out.println("The Firstname is " +Names.get(0));//To get the 1st element of the array
	System.out.println(Names.remove(0));//To remove the element based on the index
	System.out.println(Names);//To Print
	Names.add("Monty");
	System.out.println(Names);//To Print
	//Removing Debajyoti from the array
	Names.set(1, "Nandini");//Used to update the name
	System.out.println("Debajyoti is replaced with Nandini " + Names);
	//Iterate through the arraylist
	for(String name:Names) {
		System.out.println(name);
	}
	System.out.println("**************************************************");
	//normal for loop
	for(int i=0;i<Names.size();i++) {
		System.out.println(Names.get(i));
	}
	Names.add("Anvita");//Duplicates values can be added
	System.out.println(Names);
	Collections.sort(Names);
	System.out.println("The Sorted order is" + Names);
	
	List<String> Names1 = new ArrayList<>();
	Names1.add("Choukimath");
	Names1.add("Patil");
	Names.addAll(Names1);
	System.out.println(Names);
	System.out.println("**************************************************");
	
	Collections.sort(Names);
	System.out.println("The Sorted order is" + Names);
	//Validate that Nandini is present in the arraylist
	if(Names.contains("Nandini")) {
		System.out.println("Name is Present");
	}else
	{
		System.out.println("Name is not Present");
	}
	
	String nm="raju";
	System.out.println(nm.toUpperCase());
	
	}
}
