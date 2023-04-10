package FunctionalInterface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.function.Consumer;


class myconsumer implements Consumer<String>
{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("for each elements");
		System.out.println(t);	}
	
}

public class LaunchConsumer {
	
	public static void main(String[] args) {
		

		HashSet<String> name=new HashSet<String>();
		name.add("abd");
		name.add("viart");
		name.add("dhoni");
		name.add("sangakara");
		
		//normal traditional method
		Consumer c=new myconsumer();
		name.forEach(c);
		System.out.println();
		
		//lambda expression method
		name.forEach(t->{
			System.out.println("from lambda expression");
			System.out.println(t);
			System.out.println();
		});
		
		
		//method referencing(binding the abstract and instance methos);
		name.forEach(System.out :: println);
		
	}

}
