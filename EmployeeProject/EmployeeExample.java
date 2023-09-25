public class EmployeeExample {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager("employees.txt");

		// Create employee objects
		Employee empA1001 = new Employee(A1001, "Manu", "SE", 2000.0);

		// Perform CRUD operations and sorting
		// ...
	}
}