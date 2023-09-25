package string;





import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class StringEx1 {
	public static void getUninqChar(String input) {
		char[] arr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		Set<Character> srr = map.keySet();

		for (Character c : arr) {
			if (map.get(c) > 1) {
				System.out.println(c + " : " + map.get(c));
			}
		}
	}
	
	public static void main(String[] args) {
		getUninqChar("manu ur indian");
	}

}
