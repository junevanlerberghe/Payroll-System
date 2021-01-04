
import java.util.ArrayList;
import java.util.List;

public class tester {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Payroll payroll = new Payroll(employees);
		
		for (int id = 0; id < 100; id++) {
			Employee e;
			if (Math.random() < 0.5) {
				e = new hourlyEmployee("name", id, 10.50, 20.5);
				((hourlyEmployee) e).setHours(25);
			} else {
				e = new salariedEmployee("name", id, 110892.0);
			}
			payroll.addEmployee(e);
		}
		
//		System.out.println("Get $ owed for employee: " + payroll.totalAmountOwedForEmployee(23));
//		System.out.println("Get $ owed for all employees: " + payroll.totalAmountOwed());

		System.out.println(extractCity("Ithica, CA 94087"));

	}
	
	public static String extractCity(String cityZip) {
		String output = "";
		for (int i = 0; i < cityZip.length(); i++) {
			if (!cityZip.substring(i, i + 1).equals(",")) {
				output += cityZip.substring(i, i + 1);
			} else break;
		}
		return output;
	}

}
