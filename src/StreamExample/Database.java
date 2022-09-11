package StreamExample;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Roshan", "Jr Developer", 60000));
		list.add(new Employee(388, "Bill", "Senior Developer", 90000));
		list.add(new Employee(470, "Bob", "Jr BA", 50000));
		list.add(new Employee(624, "Song", "Jr Tester", 40000));
		list.add(new Employee(176, "Prakash", "Development Lead", 120000));
		return list;
	
	}
}
