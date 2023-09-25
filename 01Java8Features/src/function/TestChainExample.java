package function;

import java.util.function.Function;

public class TestChainExample {
	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		Function<Integer, Integer> func1 = x -> x * 2;

		Integer result = func.andThen(func1).apply("mkyound");

		System.out.println(result);

		Function<Integer, String> f1 = a -> a.toString();
		Function<String, Integer> f2 = b -> b.length() + 10;

		Integer res = f1.andThen(f2).apply(105);

		System.out.println(res);

		Function<Integer, Long> f4 = i -> i * i.longValue();

		Long l = f4.apply(res);

		System.out.println(l);

		// System.out.println(f1.apply(102));

	}

}
