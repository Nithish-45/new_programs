package Crud.On.Operations.method;

public class Employee {
	private int empNo;
	private String empName;
	private int salary;
	
	
	public Employee(int empNo, String empName, int salary) {
		// TODO Auto-generated constructor stub
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
//	public void Employee(int empNo,String empName,int salary){
//		
//		
//		
//	}
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
