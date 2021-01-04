
public class hourlyEmployee extends Employee{
	
	private String name;
	private int id;
	private double hourlyWage;
	private double hoursWorked;
	
	public hourlyEmployee(String name, int id, double hourlyWage, double hoursWorked) {
		super(name, id);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculatePay() {
		if (hoursWorked <= 40) {
			return hoursWorked * hourlyWage;
		} else {
			double extraHours = hoursWorked;
			return (hoursWorked * hourlyWage) + extraHours * (hourlyWage * 1.5);
		}
	}
	
	public double getHours() {
		return hoursWorked;
	}
	
	public void setHours(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double gethourlyWage() {
		return hourlyWage;
	}

	public void sethourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
}
