class Employee{
	 double salary=100000;
	public class Manager extends Employee{
public static void main(String[] args) {
	double commision=(salary*20)/100;
	double total_salary=salary+commision;
	System.out.println("Manager's salary is "+total_salary);
}
	}
}