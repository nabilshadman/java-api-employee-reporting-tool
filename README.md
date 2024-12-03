# Java API Employee Reporting Tool  

## Description  
The **Java API Employee Reporting Tool** is a lightweight Java application for managing employee data. It allows users to create, display, and validate employee records, while also generating a salary report in CSV format as part of the output. Exception handling ensures input validation, such as rejecting invalid numerical values for attributes like salary and hours worked. The application generates a `salary_report_employee.csv` file that contains the calculated salaries for all employees entered.

The tool demonstrates how employee data can be processed, validated, and reported efficiently.
 

## Features  
- **Employee Class**: Represents an employee with attributes such as name, hourly salary, and hours worked.  
- **Custom Exception Handling**: Includes `InvalidNumberException` to ensure valid numerical input for attributes like salary and hours worked.  
- **Salary Report Generation**: After entering employee data, the program generates a CSV file (`salary_report_employee.csv`) containing the employee salary details.  
- **Data Display**: Outputs employee details and total salary in a formatted report.  
- **Interactive Input**: Prompts the user to input the number of employees, along with their name, hourly salary, and hours worked.  
- **User-friendly Validation**: Ensures that inputs like the number of employees, hourly salary, and hours worked are positive numbers.  
 
## File Overview  
### [Employee.java](https://github.com/nabilshadman/java-api-employee-reporting-tool/blob/main/EmployeeReport/src/Employee.java)  
Defines the `Employee` class, including attributes such as:  
- `String name`  
- `double salary`  

Methods include constructors, getters, setters, and a `toString` method for displaying employee details.  

### [InvalidNumberException.java](https://github.com/nabilshadman/java-api-employee-reporting-tool/blob/main/EmployeeReport/src/InvalidNumberException.java)  
Defines a custom exception to handle invalid numerical inputs, particularly for attributes like employee salary.  

### [Driver.java](https://github.com/nabilshadman/java-api-employee-reporting-tool/blob/main/EmployeeReport/src/Driver.java)  
Contains the main method for running the program. Demonstrates:  
- Creating employee objects.  
- Validating input data.  
- Displaying employee details using the `toString` method.  

## Usage  
1. Compile the project:  
   ```bash
   javac EmployeeReport/src/*.java
   ```  

2. Run the `Driver` program:  
   ```bash
   java -cp EmployeeReport/src Driver
   ```  

3. Follow on-screen [prompts](https://github.com/nabilshadman/java-api-employee-reporting-tool/tree/main/demo) to input employee data.  

## Sample Output  
```
How many employees are there? Please enter a number: -2  
Please try again with a positive number!  
How many employees are there? Please enter a number: 2  

Please enter employee 1's data below.  
Name: John  
Hourly salary (number): 20.5  
Hours worked (number): 40  

Please enter employee 2's data below.  
Name: Jane  
Hourly salary (number): 25.0  
Hours worked (number): 35  

Salary Report:
----------------------------------------------------
Name     Hourly Salary   Hours Worked   Total Salary
----------------------------------------------------
John     20.50           40             820.00
Jane     25.00           35             875.00

Salary report employee.csv has been created.  
Thank you for using Salary Reporting Tool!
```

## Requirements  
- Java 8 or later.  

## Contributing  
Contributions are welcome. Feel free to open issues or submit pull requests!  

## License  
This project is licensed under the [MIT License](https://github.com/nabilshadman/java-api-employee-reporting-tool/blob/main/LICENSE.txt).
