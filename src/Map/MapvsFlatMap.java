package Map;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {

	public static void main(String[] args) {
	List<Customer> customers = CustomerDatabase.getAll();
	
	//Convert List<Customer> to List<String>
	
	//Convert List<Customer> to List<String> of emails-1 email for 1 customer 1 to 1 mapping
	List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
	
	//Convert List<Customer> to List<String> of Phone numbers - Many PN to 1 customer 1 to many mapping.
	List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
	
	System.out.println(phoneNumbers);
	
	}
}
