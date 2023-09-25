package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramExample {
	public static void main(String[] args) {

//		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);

//		stream.forEach(System.out::println);

//		Stream<Integer> stream=Stream.of( new Integer[] {1,2,3,4,5,6,7,8,9});
//		stream.forEach(System.out::print);

//		List<Integer> list=new ArrayList<>();
//		for(int i=1;i<=5;i++)
//		{
//			list.add(i);
//			
//			Stream<Integer> stream=list.stream();
//			
//			stream.forEach(p->System.out.print(p+" "));
//		
//		}

//		Stream<Integer> randomNumbers=Stream.generate(()->(new Random().nextInt(25)));
//		
//		randomNumbers.limit(25).forEach(System.out::println);
//		

//		IntStream stream="12345_abcdefg".chars();
//		
//		stream.forEach(System.out::println);
//		

//		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
//
//		stream.forEach(p -> System.out.println(p));
		
		
		
//		List<Integer> ob=new ArrayList<>();
//		for(int i=1;i<=10;i++)
//		{
//			ob.add(i);
//		}
		
//		Stream<Integer> stream=ob.stream();
//		
//		List<Integer> even=stream.filter(p->p%2==0).collect(Collectors.toList());
//
//		System.out.println(even);
		
		
//		List<Integer> ob=new ArrayList<>();
//		for(int i=1;i<=10;i++)
//		{
//			ob.add(i);
//		}
//		
//		Stream<Integer> stream=ob.stream();
//		
//		Integer[] even =stream.filter(i->i%2==0).toArray(Integer[]::new);
//		
//		System.out.println(Arrays.toString(even));
		
		
		List<String> ob=new ArrayList<>();
		ob.add("Amitabh");
		ob.add("Shekar");
		ob.add("Aman");
		ob.add("Rahul");
		ob.add("Shahrukh");
		ob.add("SalMan");
		ob.add("Yana");
		ob.add("Lokesh");
		
		
		//ob.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
		
	//	ob.stream().filter(s->s.startsWith("A")).map(e->e.toUpperCase()).forEach(System.out::println);
		
		
		
//		ob.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		
		
//		List<String> lo=ob.stream().sorted().map(e->e.toLowerCase()).collect(Collectors.toList());
//	
//		System.out.println(lo);
		
		
     boolean b=	ob.stream().anyMatch((s)->s.endsWith("a"));
     System.out.println(b);
     
     b=ob.stream().allMatch((s)->s.startsWith("A"));
     System.out.println(b);
     
     
     int co=(int) ob.stream().filter(e->e.startsWith("A")).count();
		
		System.out.println(co);
		
		
		Optional<String> red=ob.stream().reduce((s1,s2)->s1+"#"+s2);
		
		System.out.println(red);
	}

}
