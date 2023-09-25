package function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {

		Test2 obj = new Test2();

		List<String> list = Arrays.asList("node", "c++", "java", "javascript");

		Map<String, Integer> map = obj.covertListToMap(list, x -> x.length());

		System.out.println(map);

		Map<String, Integer> map2 = obj.covertListToMap(list, obj::getlength);

		System.out.println(map2);
	}

	public <T, R> Map<T, R> covertListToMap(List<T> list, Function<T, R> func) {

		Map<T, R> result = new HashMap<>();

		for (T t : list) {

			result.put(t, func.apply(t));
		}

		return result;
	}

	Integer getlength(String str) {
		return str.length();
	}

}
