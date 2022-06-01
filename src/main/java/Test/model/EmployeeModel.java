package Test.model;

public class EmployeeModel {

	private String employeeName;
	private Integer employeeId;
	private Integer employeeAge;
	private Double salary;
	private String gender;

	public EmployeeModel(String employeeName, Integer employeeId, Integer employeeAge, Double salary, String gender) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
		this.salary = salary;
		this.gender = gender;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeModel [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeAge="
				+ employeeAge + ", salary=" + salary + ", gender=" + gender + "]";
	}

}
