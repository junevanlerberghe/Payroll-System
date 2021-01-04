import java.util.ArrayList;
import java.util.HashMap;

public class Payroll {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Payroll(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	
	public void removeEmployee(Employee e) {
		employees.remove(e);
	}
	
	public double totalAmountOwedForEmployee(int employee) {
		Employee e = employees.get(employee);
		return e.calculatePay();
	}
	
	public double totalAmountOwed() {
		double sum = 0.0;
		for (int i = 0; i < employees.size(); i++) {
			sum += employees.get(i).calculatePay();
		}
		return sum;
	}
	
}
