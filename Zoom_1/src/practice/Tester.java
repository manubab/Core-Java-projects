
package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("java", "c", "python");

		Set<String> set = lines.stream().filter(e -> "c".equals(e)).collect(Collectors.toSet());

		// System.out.println("Filtered List :"+set.toString());

		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

		Set<Integer> listOfInteger = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toSet());

		// System.out.println(listOfInteger.toString());

		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(1, 3, 5);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7);

		List<Integer> numbers = Stream.of(evens, odds, primes).flatMap(list -> list.stream())
				.collect(Collectors.toList());

		System.out.println("flattend list :" + numbers);

		List<Integer> sortList = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(sortList);

	}
}