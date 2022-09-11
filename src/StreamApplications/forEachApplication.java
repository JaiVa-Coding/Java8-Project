package StreamApplications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEachApplication {
	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Jai");
	list.add("Ranjith");
	list.add("Peter");
	list.add("Jim");
	list.add("Chang");
	
	Map<Integer, String> map = new HashMap<>();

	map.put(1, "a");
	map.put(2, "b");
	map.put(3, "c");
	map.put(4, "d");

	/*
	for (String s : list) {
		if (s.startsWith("J")) {
			System.out.println(s);
		}
	}
	
	*/
	
	//t -> System.out.println(t);
	
	//list.stream().forEach(t -> System.out.println(t));
	//map.forEach((key,value)->System.out.println(key + ":" + value));
	//map.entrySet().stream().forEach(obj -> System.out.println(obj));
	map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));
	
	//t -> t.startsWith("J");
	
	list.stream().filter(t -> t.startsWith("J")).forEach(t -> System.out.println(t));
   
	}

}
