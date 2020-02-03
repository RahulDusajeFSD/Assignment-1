//package com.cg.eis.exception;
import com.cg.eis.exception.EmployeeException;
import java.util.*;

class EmployeeSalary
{

	static void Validate(int salary) throws EmployeeException
	{
		if(salary<3000)
			throw new EmployeeException();
		else
			System.out.println("Salary works");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();

		try
		{
			Validate(salary);
		}
		catch(EmployeeException ae)
		{
			new EmployeeException().EmpExep();
		}
	}

}