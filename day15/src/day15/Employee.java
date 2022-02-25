package day15;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private String email;
	
	public Employee(Integer id, String name, Double salary , String email) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id +", name="+ name+", salary=" + salary+ ", email="+ email+"]"; 
				
	}
}
