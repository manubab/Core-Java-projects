package functionalInterfaces;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

interface Suplier<T> {
	T get();

}

public class Test1<T> {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd  , HH:mm:ss");

	public Supplier<List<String>> supplier() {

//		return ()->new ArrayList<>(Arrays.asList("Janu","Manu"));
		return ArrayList::new;

	}

	public static void main(String[] args) {

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();

		LocalDateTime dt = s.get();

		System.out.println(dt);

		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String dt1 = s1.get();
		System.out.println(dt1);

		Supplier<Integer> s2 = () -> Integer.parseInt("123");

		System.out.println(s2.get());

		Test1<String> obj = new Test1();

		List<String> list = obj.supplier().get();

		System.out.println(list);

		Developer obj2 = factory(Developer::new);

		System.out.println(obj2);

		Developer d = factory(() -> new Developer("mKyoung"));

		System.out.println(d);

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(" Urs Random Value :" + randomValue.get());

	}

	public static Developer factory(Supplier<? extends Developer> s) {
		Developer developer = s.get();

		if (developer.getName() == null || "".equals(developer.getName())) {
			developer.setName("default");
		}
		developer.setSalary(BigDecimal.ONE);
		developer.setStart(LocalDate.of(2023, 8, 23));

		return developer;
	}

}

class Developer {
	String name;
	BigDecimal salary;
	LocalDate start;

	public Developer() {
	}

	public Developer(String name) {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}

}
