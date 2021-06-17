import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This is Employee Class that stores employee's name,
 * hourly salary and hours worked. It provides method to
 * print weekly salary report in csv file.
 * @author nabil
 *
 */
public class Employee {

	private String name;
	private double hourlySalary;
	private int hoursWorked;

	/**
	 * this is no-argument constructor
	 */
	public Employee() {
		this.name = "Unknown";
		this.hourlySalary = 0.0;
		this.hoursWorked = 0;
	}

	/**
	 * this is parameterized constructor
	 * @param name string literal for employee name
	 * @param hourlySalary integer literal for hourly salary
	 * @param hoursWorked integer literal for hours worked in a week
	 */
	public Employee(String name, double hourlySalary, int hoursWorked) {
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.hoursWorked = hoursWorked;
	}

	/**
	 * this method returns employee name
	 * @return employee name
	 */
	public String getName() {
		return name;
	}

	/**
	 * this method returns hourly salary
	 * @return hourly salary
	 */
	public double getHourlySalary() {
		return hourlySalary;
	}

	/**
	 * this method returns hours worked in a week
	 * @return hours worked
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * this method sets employee name
	 * @param name employee name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * this method sets hourly salary
	 * @param hourlySalary hourly salary
	 */
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	/**
	 * this method sets hours worked in a week
	 * @param hoursWorked hours worked
	 */
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * this method prints weekly salary report in csv file
	 * @param employees ArrayList of employees
	 * @throws FileNotFoundException if file not found exception occurred
	 */
	public static void printSalaryReport(ArrayList<Employee> employees) throws FileNotFoundException { 
		FileOutputStream fos = new FileOutputStream("employee.csv", true);
		PrintWriter pw = new PrintWriter(fos);

		pw.println("Employee Name,Salary,Hours,Weekly Pay");

		for (int i = 0; i < employees.size(); i++) {
			pw.println(employees.get(i).getName() + "," + 
					employees.get(i).getHourlySalary() + "," + 
					employees.get(i).getHoursWorked() + "," + 
					(employees.get(i).getHourlySalary()*employees.get(i).getHoursWorked()));
		}

		pw.close();
	}

}
