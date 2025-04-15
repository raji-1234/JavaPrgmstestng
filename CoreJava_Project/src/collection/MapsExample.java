package collection;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
public static void main(String[] args) {
	Map<String,String> Ministers = new HashMap<>();
	Ministers.put("FM", "Niramala");
	Ministers.put("HM", "Amit");
	Ministers.put("PM", "Modi");

	System.out.println(Ministers);
	// fetch data from Map
	System.out.println("Financial Minister is " + Ministers.get("FM"));
//	Ministers.put("PM", "Modi");
//	System.out.println(Ministers);

	// remove the data from map
	System.out.println("The Removed Minister is " + Ministers.remove("HM"));
	//System.out.println("The Removed Minister is " + Ministers);

	// Update the data in map
	Ministers.put("FM", "New FM Name Nirmala");
	System.out.println(Ministers);
	

	// Print all the keys in Map
	System.out.println(Ministers.keySet());
	
	if(Ministers.keySet().contains("HM")) {
		System.out.println("HM is Present");
	}else {
		System.out.println("HM is not Present");
	}
	Ministers.put("HM", "Amit");
	System.out.println(Ministers);
	
	for(String Mn: Ministers.keySet()) {
		System.out.println("Ministry is " + Mn);
		System.out.println("Minister name is " + Ministers.get(Mn));
	}
	
	//Find the occurance on charaters in a string
	//key is character and value is occurance
	String str1 = "my name is rajeshwari choukimath";
	Map<Character,Integer> Output = new HashMap<>();
	for (int i=0; i<str1.length();i++) {
		char ch=str1.charAt(i);
		// for the first time while adding the char
		if(!Output.keySet().contains(ch)) {
			Output.put(ch, 1);
		}
		// From second time onwards it will go to else

		else {
			int val = Output.get(ch);
			Output.put(ch, val + 1);
		}

	}
	System.out.println(Output);


}
}
