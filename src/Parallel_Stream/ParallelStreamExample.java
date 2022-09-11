package Parallel_Stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		
		System.out.println("Normal Stream took time : " + (end - start));
		
		//Parallel Streams
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Streaming took time : " + (end - start));
		
	}
	
	
	
}
