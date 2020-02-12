package com.ibm.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	
	Connection dbCon;
	PreparedStatement pstmt; 
	
	
public Main() {
	
	
		try {
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=IST", "root", "");
			System.out.println("Successfully connected");
		} catch(Exception e) {
			System.out.println(e);
		}
	} 
	
	
	public static void main(String[] args) 
	{
		Main m=new Main();
		Integer option =0;

    	while(option!=5)
        {
		System.out.println("Welcome to Employee Database system");
		System.out.println("Press 1 to Add a new Employee:");
    	System.out.println("Press 2 to Display all the Employees:");
    	System.out.println("Press 3 to update Employee by Id:");
    	System.out.println("Press 4 to Delete a Employee by Id:");
    	System.out.println("Press 5 to Exit");
		
		
    	Scanner sc = new Scanner(System.in);
    	option = sc.nextInt();
    	sc.nextLine();
    	switch(option){
    		case 1:
    				m.addEmployee();
    				break;
    		case 2:
    				m.display();
    				break;
    		case 3:
    			System.out.println("Enter Employee id to update with");
    			int qq=sc.nextInt();
    			sc.nextLine();
    			System.out.println("Press 1 to update Name");
    			System.out.println("Press 2 to update Age");
    			System.out.println("Press 3 to update Salary");
    			
    			System.out.println("Enter your choice");
    			int choice=sc.nextInt();
    			sc.nextLine();
    			
    			switch(choice)
    			{
    			case 1:
    				System.out.println("Enter new name");
    				String newname=sc.nextLine();
    				m.updateName(newname,qq);
    				break;
    				
    				
    			case 2:
    				System.out.println("Enter new Age");
    				int g=sc.nextInt();
    				m.updateAge(g,qq);
    				break;
    				
    			case 3:
    				System.out.println("Enter new Salary");
    				int p=sc.nextInt();
    				m.updateSalary(p,qq);
    				break;
    				
    			}
    			break;
    			
    		case 4:
    			System.out.println("Enter the Employee Id to delete");
    			int id=sc.nextInt();
    			m.delete(id);
    			break;
    			
 
    	}
    	
    	
	} 
	}
	
	
	void updateName(String name,int id) {
		String updateQry = "update empdetails set Name = ? where Id = ?";
		try {
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			if(pstmt.executeUpdate()>0) {
				System.out.println("done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void updateAge(int age,int id) {
		String updateQry = "update empdetails set Age = ? where Id = ?";
		try {
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt.setInt(1, age);
			pstmt.setInt(2, id);
			if(pstmt.executeUpdate()>0) {
				System.out.println("done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void updateSalary(int salary,int id) {
		String updateQry = "update empdetails set salary = ? where Id = ?";
		try {
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt.setInt(1, salary);
			pstmt.setInt(2, id);
			if(pstmt.executeUpdate()>0) {
				System.out.println("done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void delete(int id)
	{
		String delQry="delete from empdetails where id=?";
		
		try
		{
			pstmt = dbCon.prepareStatement(delQry);
			pstmt.setInt(1,id);
			
			if(pstmt.executeUpdate()>0)
				System.out.println("Employee Deleted Successfully");
			else
				System.out.println("No records to be deleted");
		}
		catch(SQLException e)
		{
			e.printStackTrace();	
		}
	}
	
	public void display()
	{
		String printQry="Select * from empdetails";
		
		try
		{
			pstmt=dbCon.prepareStatement(printQry);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Name:"+rs.getString("Name"));
				System.out.println("ID:"+rs.getInt("Id"));
				System.out.println("Age:"+rs.getInt("Age"));
				System.out.println("Salary:"+rs.getInt("Salary"));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	void addEmployee()
	{
		Scanner sc=new Scanner(System.in);
		String insertQry="Insert into empdetails values(?,?,?,?)";
		
		try
		{
			pstmt=dbCon.prepareStatement(insertQry);
			
			System.out.println("Enter Name of Employee");
			String name=sc.nextLine();
			System.out.println("Enter Id of Employee");
			int id=sc.nextInt();
			System.out.println("Enter Age of Employee");
			int age=sc.nextInt();
			System.out.println("Enter Salary of Employee");
			int salary=sc.nextInt();
			
			pstmt.setString(1,name);
			pstmt.setInt(2, id);
			pstmt.setInt(3,age);
			pstmt.setInt(4,salary);
			
			if(pstmt.executeUpdate()>0){
				System.out.println("Registered successfully");
			}
			else {
				System.out.println("Failed");
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error occured in Registering");
			
		}
		
	}
	
	
	
	

	}

