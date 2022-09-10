package FIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierApplication {
/*
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello this is a Java8 application";
	}
	
	*/
	public static void main(String[] args) {
		//Supplier<String> supplier = () -> ("Hello this is a Java8 application");
	//	System.out.println(supplier.get());
		
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(() -> ("Hello this is a Java8 application")));
	}
	
}
