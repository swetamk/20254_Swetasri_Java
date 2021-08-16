
import java.util.ArrayList;

public class EmployeeImpl implements EmployeeInt {
	ArrayList<Employee> L=new ArrayList<>();
	@Override
	public void addEmployee(Employee e) {
		L.add(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		L.remove(e);
		
	}

	@Override
	public double yearSalary(Employee e1) {
		for(Employee x : L) {
			if(x.ename.equals(e1.ename)) {
				return x.sal;
			}
		}
		return 0;
}

	@Override
	public double appSalary(Employee e1) {	
		return 0;
	}

	
	public ArrayList<Employee> getEmpList(){
		return L;
	}

}
