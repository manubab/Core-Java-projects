package test;

import java.io.*;
import java.util.*;

public class EmpCurd {
	private List<Employee> employees;
	private String filePath;
	private Scanner sc = new Scanner(System.in);

	public EmpCurd(String filePath) {
		this.filePath = filePath;
		employees = new ArrayList<>();
		loadEmployees();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
		saveEmployees();
	}

	public void saveEmployees() {
		try (Writer writer = new FileWriter(filePath)) {
			for (Employee employee : employees) {
				writer.write(employee.getId() + "," + employee.getName() + "," + employee.getDesg() + ","
						+ employee.getSal() + "\n");
			}
			System.out.println("Employees saved successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadEmployees() {
		employees.clear();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				String id = values[0];
				String name = values[1];
				String designation = values[2];
				double salary = Double.parseDouble(values[3]);
				Employee employee = new Employee(id, name, designation, salary);
				employees.add(employee);
			}
			System.out.println("Employees loaded successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(String employeeId) {
		employees.removeIf(employee -> employee.getId() == employeeId);
		saveEmployees();
	}

	public void sortEmployeesById() {
		employees.sort(Comparator.comparing(Employee::getId));
	}

	public void displayEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void updateEmployee(String id, String name, String desg, double sal) {
		for (Employee e : employees) {
			if (e.getId().equals(id)) {
				e.setName(name);
				e.setDesg(desg);
				e.setSal(sal);
				System.out.println(e);
			}
			System.out.println(e);

		}
	}

	public void generateJavaFile(String fileName) {
		try (Writer writer = new FileWriter(fileName)) {
			writer.write("public class " + fileName.replace(".java", "") + " {\n\n");
			writer.write("\tpublic static void main(String[] args) {\n");
			writer.write("\t\tEmployeeManager manager = new EmployeeManager(\"employees.txt\");\n");
			writer.write("\n\t\t// Create employee objects\n");
			for (Employee employee : employees) {
				writer.write("\t\tEmployee emp" + employee.getId() + " = new Employee(" + employee.getId() + ", \""
						+ employee.getName() + "\", \"" + employee.getDesg() + "\", " + employee.getSal() + ");\n");
			}
			writer.write("\n\t\t// Perform CRUD operations and sorting\n");
			writer.write("\t\t// ...\n");
			writer.write("\t}\n");
			writer.write("}");
			System.out.println("Java file generated successfully: " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
