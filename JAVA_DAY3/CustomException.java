package com.sonata1;

public class CustomException{
    int salary;
		public class salaryExp  extends Exception{
			salaryExp(String s1){
				super(s1);
			}
		}

		public void salary(int salary) throws salaryexception{
			if(salary<100000){
				throw new salaryexception ("salary shouldn't be less than 100000");
			}
			else{
				System.out.println("Salary is : "+salary);
			}
		}
		public static void main(String[] args) throws salaryexception{
			CustomException exp=new CustomException();
		    exp.sal=50000;
			exp.salary(exp.sal);

		}

}