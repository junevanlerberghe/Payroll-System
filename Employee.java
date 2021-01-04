
public abstract class Employee {
	protected String name;
	protected int id;
	
	protected Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}
	
	abstract double calculatePay();
}
