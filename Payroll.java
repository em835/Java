/*(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 6.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)

ex:
Enter employee's name:
Enter number of hours worked in a week:
Enter hourly pay rate:
Enter federal tax withholding rate:
Enter state tax withholding rate:
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $6.75
Gross Pay: $67.5
Deductions:
Federal Withholding (20.0%): $13.5
State Withholding (9.0%): $6.07
Total Deduction: $19.57
Net Pay: $47.92 

*/
	
import java.util.Scanner;
 
public class Main {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter employee's name:");
  String name = input.nextLine();
 
  System.out.print("Enter number of hours worked in a week:");
  double hours = input.nextDouble();
 
  System.out.print("Enter hourly pay rate:");
  double rate = input.nextDouble();
 
  System.out.print("Enter federal tax withholding rate:");
  double ftax = input.nextDouble();
 
  System.out.print("Enter state tax withholding rate:");
  double stax = input.nextDouble();
 
  System.out.println("Employee Name:" + name);
  System.out.println("Hours Worked:" + hours);
  System.out.println("Pay Rate: $" + rate);
  System.out.println("Gross Pay: $" + rate * hours);
  System.out.println("Deduction:");
  System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", ftax * 100,
    ftax * rate * hours);
  System.out.printf("State Withholding (%.1f%%): $%.2f\n", stax * 100,
    stax * rate * hours);
  System.out.printf("Total Deduction: $%.2f\n", (stax + ftax) * rate
    * hours);
  System.out.printf("Net Pay: $%.2f\n", (1 - stax - ftax) * rate * hours);
 
 }
 
}
