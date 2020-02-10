import java.util.*;
import java.lang.*;


class Employee
{
	
	private String name;
	private int age;

	static Object func()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String s=sc.nextLine();
			System.out.println("Enter Age");
			int n=sc.nextInt();
			return new Employee(s,n);
			

	}
	Employee(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public Integer getAge()
	{
		return this.age;
	}
	@Override
	public String toString()
	{
		return this.getName()+" " +this.getAge();
	}
	public String getFirstName()
	{
		String[] words=name.split(" ");
		return words[0];
	}
	public String getLastName()
	{
		String[] words=name.split(" ");
		if(words.length>0)
			return words[1];
		return "Enter Last name";
	}
}
	class SortByFirstName implements Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getFirstName().compareTo(((Employee)secondObj).getFirstName());
    }
}

    class SortByLastName implements Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){


        return ((Employee)firstObj).getLastName().compareTo(((Employee)secondObj).getLastName());
    }
}
     class SortByAge implements Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getAge().compareTo(((Employee)secondObj).getAge());
    }

}




class FirstLastNamesCompareAPI
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List employeeList1=new ArrayList();


		int option=0;


		while(option!=6)
		{
		System.out.println("Welcome To Employee Desk");
		System.out.println("Press 1 to Employee");
		System.out.println("Press 2 to SortByFirstName");
		System.out.println("Press 3 to SortByLastName");
		System.out.println("Press 4 to SortByAge");
		System.out.println("Press 5 to display");
		System.out.println("Press 6 to Exit");

		option= scan.nextInt();
		scan.nextLine();

		switch(option)
		{
			case 1: employeeList1.add(Employee.func());
					break;
			
			case 2: Collections.sort(employeeList1, new SortByFirstName());break;

			case 3:Collections.sort(employeeList1, new SortByLastName());break;

			case 4: Collections.sort(employeeList1, new SortByAge());break;

			case 5:System.out.println(employeeList1);break;
		}
		}
		 /*employeeList1.add(new Employee("Rahul Dusaje",16));
		employeeList1.add(new Employee("Shweta M",15));
		employeeList1.add(new Employee("Karan SA",19)); */


	}
}