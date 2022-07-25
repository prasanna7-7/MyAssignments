package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String Name) {
		System.out.println(Name);
	}
	public void printEmployeeId(long Id) {
		System.out.println(Id);
	}
	public void printEmployeeAdress(String Adress) {
		System.out.println(Adress);
	}
	public void printEmployeeSalary(double Salary) {
		System.out.println(Salary);
	}
	public void printEmployeeNumber(long Number) {
		System.out.println(Number);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("Prasanna");
		emp.printEmployeeId(7463782746345L);
		emp.printEmployeeAdress("39/2,Meenakshipuram 4th street");
	    emp.printEmployeeSalary(39999.999);
		emp.printEmployeeNumber(9080818140L);
	}
}
