package SortApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import StreamExample.Database;
import StreamExample.Employee;

public class SortDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		List<Employee> employees = Database.getEmployees();
		/*
		Collections.sort(employees, (o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));
		System.out.println(employees);
		*/
		
		employees.stream().sorted((o1,o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		/*
		Collections.sort(list);
		System.out.println(list);
		
		list.stream().sorted().forEach(s -> System.out.println(s));
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		*/
		
		
	}

}
