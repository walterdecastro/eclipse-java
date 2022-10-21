package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		grossSalary -= tax;
		return grossSalary;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", grossSalary);
	}
	
}
