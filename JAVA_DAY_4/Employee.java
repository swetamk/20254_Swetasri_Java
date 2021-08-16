public class Employee {
	int eid;
	String ename;
	double sal;
	
	public Employee(int id,String name,double sal) {
		this.eid = id;
		this.ename = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeId:" + eid+ "\n" +
	           "EmployeeName=" + ename +"\n"+ " "
	           	+ "salary=" + sal;
	}

}
