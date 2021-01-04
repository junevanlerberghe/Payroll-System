
public class salariedEmployee extends Employee{
	
	private String name;
	private int id;
	private double annualWage;
	
	public salariedEmployee(String name, int id, double annualWage) {
		super(name, id);
		this.annualWage = annualWage;
	}
	
	public double calculatePay() {
		return annualWage * (1/(double)51);
	}

	public double getannualWage() {
		return annualWage;
	}

	public void setannualWage(double annualWage) {
		this.annualWage = annualWage;
	}
	
}
