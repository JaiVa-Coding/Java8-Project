package FIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApplication{
	

	public static void main(String[] args) {
		/*
		Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);
		consumer.accept(15);
		*/
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		list1.stream().forEach(t-> System.out.println("Printing : " + t));
	}

	/*
	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Printing : " + t);
	}
	
	*/
}
