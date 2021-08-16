package com.sonata1;

public class Employee {
	int eid;
	String ename;
	double salary;
	public Employee(int id,String name,Double salary) {
		this.eid=id;
		this.ename=name;
		this.salary=salary;
		this.salCal();
	}
	public void salCal(){
		System.out.println(this.salary*12);
	}
	
	public void display(){
		System.out.println("employeeId:"+eid+"\n"+
							"employeeName:"+ename+"\n+"
							+"salary:"+salary+"\n");
	}
}
class Manager extends Employee{

	Manager(int id, String name, Double salary) {
		super(id, name, salary);
		this.salCal();
	}
	
	@Override
	public void salCal(){
		System.out.println("ManagerSal:"+1.1*this.salary*12);//10percent more than normal employee
	}
}
class Developer extends Employee{

	Developer(int id, String name, Double salary) {
		super(id, name, salary);
		this.salCal();
	}
	@Override
	public void salCal(){
		System.out.println("DevSal:"+1.15*this.salary*12);//15 percent more
	}
}
class Tester extends Employee{

	Tester(int id, String name, Double salary) {
		super(id, name, salary);
		this.salCal();
	}
	@Override
	public void salCal(){
		System.out.println("TesterSal:"+1.05*this.salary*12); //5percent more
	}
	
	public static void main(String args[]){
		Employee EM = new Employee(100,"abc",10000.00);
		Manager ME = new Manager(101,"xyz",10000.00);
		Developer DE = new Developer(102,"STU",10000.00);
		Tester TE = new Tester(103,"PQR",10000.00);
		

	}
}