import java.util.ArrayList;

public class UserEmployee
{
	public static void display(ArrayList<Employee> A) {
		for(Employee ob : A) {
			System.out.println("Employee Id:"+ob.eid);
			System.out.println("Employee Name:"+ob.ename);
			System.out.println("Employee Monthly Salary:"+ob.sal);
		}
	}
	
	public static void YearlySal(ArrayList<Employee> A) {
		for(Employee ob:A) {
			System.out.println("Employee ID:"+ob.eid);
			System.out.println("YearlySal:"+(ob.sal*12));
		}
	}
	
	public static ArrayList<Employee> increaseSal(ArrayList<Employee> A) {
		for(Employee ob:A) {
			if(ob.sal<1000)
				ob.sal += 5000;
		}
		return A;
	}
	
	public static void main(String args[]) throws MyownException
	{
		Employee e1=new Employee(101,"PQR",10000.00);
		Employee e2=new Employee(102,"LMS",2000.00);
		Employee e3=new Employee(103,"STR",5000.00);
		EmployeeImpl ob = new EmployeeImpl();
		ob.L.add(e1);
		ob.L.add(e2);
		ob.L.add(e3);
		for(int i=0;i<ob.L.size();i++) {
			for(int j=i+1;j<ob.L.size();i++) {
				if(ob.L.get(i).eid==ob.L.get(j).eid) {
					throw new MyownException("Duplicate Employee Id Found");
				}
			}
		}
		
		UserEmployee.display(ob.L);
		UserEmployee.increaseSal(ob.L);
		UserEmployee.YearlySal(ob.L);
	}
}

