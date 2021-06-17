import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver class that contains main method of Employee class
 * @author nabil
 *
 */
public class Driver {

	/**
	 * this is main method that prompts user for employee information,
	 * stores them in ArrayList, and calls printSalaryReport
	 * @param args
	 * @throws FileNotFoundException if file not found exception occurred
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// welcome message
		System.out.println("-------------------------------------");
		System.out.println("Welcome to the Salary Reporting Tool!");
		System.out.println("-------------------------------------\n");

		// initialize scanner
		Scanner scanner = new Scanner(System.in);

		// prompt user to enter number of employees and verify input
		int numEmployees = 0;
		do {
			System.out.print("How many employees are there? Please enter a number: ");
			try {
				numEmployees = scanner.nextInt();
				if (numEmployees <= 0) {
					throw new InvalidNumberException("Please try again with a positive number!");
				}
			} catch (InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		} while (!(numEmployees > 0));

		// initialize ArrayList to store employees
		ArrayList<Employee> employees = new ArrayList<Employee>();

		// prompt user to enter name, salary, and hours for each employee 
		// and store each employee object in ArrayList
		for (int i = 0; i < numEmployees; i++) {
			System.out.println("Please enter employee " + (i+1) + "'s data below.");
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Hourly salary (number): ");
			double hourlySalary = scanner.nextDouble();
			System.out.print("Hours worked (number): ");
			int hoursWorked = scanner.nextInt();
			Employee employee = new Employee(name, hourlySalary, hoursWorked);
			employees.add(employee);
			System.out.println();
		}

		// print salary report and confirm
		Employee.printSalaryReport(employees);
		System.out.println("Salary report employee.csv has been created.");
		System.out.println("Thank you for using Salary Reporting Tool!");

	}
}
