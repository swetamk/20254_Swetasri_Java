import java.util.ArrayList;
import java.util.Comparator;
public class Student {
	int sid;
	String sname;
	double smarks;
	public Student(int id,String name,double marks)
	{
		this.sid=id;
		this.sname=name;
		this.smarks=marks;
	}
	
	

	public static void main(String args[])
	{
		ArrayList<Student>S=new ArrayList<Student>();
		S.add(new Student(1,"ABC",60));
		S.add(new Student(2,"PQR",80));
		S.add(new Student(3,"XYZ",50));
		S.add(new Student(4,"MAX",80));
		S.add(new Student(5,"ING",100));
	    
		Comparator<Student> sorted= (Student b1,Student b2) -> (int) (b2.smarks - b1.smarks);

}

