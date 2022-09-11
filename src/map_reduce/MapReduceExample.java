package map_reduce;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,7,9,5,6,2);
	
	List<String> words = Arrays.asList("corejava", "spring", "hibernate");
	int sum = 0;
			
	for(int no: numbers) {
		sum = sum + no;
	}
	System.out.println(sum);
	
	int sum1 = numbers.stream().mapToInt(i->i).sum();
	
	Integer reducesum = numbers.stream().reduce(0,(a,b) -> a + b);
	
	System.out.println(reducesum);
	
	Integer multiply = numbers.stream().reduce(0, (a,b) -> a * b);
	System.out.println(multiply);
	
	String longestString = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
	
	System.out.println(longestString);
	
	//Step 1 get Employees of Grade A
	
	EmployeeDatabase.getEmployees().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"));
	
	//Step 2 get Salary
	   double avgSalary = EmployeeDatabase.getEmployees().stream()
               .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
               .map(employee -> employee.getSalary())
               .mapToDouble(i -> i)
               .average().getAsDouble();

       System.out.println(avgSalary);

      //step 3 get sum of salaries
       double sumSalary = EmployeeDatabase.getEmployees().stream()
               .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
               .map(employee -> employee.getSalary())
               .mapToDouble(i -> i)
               .sum();
       System.out.println(sumSalary);
   }
	
	
}
