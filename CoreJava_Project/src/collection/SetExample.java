package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
public static void main(String[] args) {
	Set<Integer> Numbers = new HashSet<>();
	Numbers.add(22);
	Numbers.add(67);
	Numbers.add(45);
	Numbers.add(27);
	
	System.out.println(Numbers);//Out was [67, 22, 27, 45] //No insertion is maintained
	
	Numbers.add(27);
	System.out.println(Numbers);
	
	//Collections.sort(Numbers); Collection only allows List,it will not accept Set
	//So convert Set into List
	
	List<Integer> NumberList = new ArrayList<>(Numbers);
	Collections.sort(NumberList);
	System.out.println(NumberList);
	// No duplicate allowed in Set but in List we can
			// Set will not maintain the insertion order
}
}
