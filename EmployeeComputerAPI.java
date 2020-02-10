


import java.util.*;
class EmployeeComputerAPI{

	static List list = new java.util.ArrayList();

    public static void main(String[] args) 
    {
    	Integer option =0;

    	while(option!=6)
        {
    	System.out.println("Welcome to Employee Computer Desk");
    	System.out.println("Press 1 to Add a new Computer:");
    	System.out.println("Press 2 to Display all the Computers:");
    	System.out.println("Press 3 to Search for a Computer:");
    	System.out.println("Press 4 to Delete a Computer by ID:");
    	System.out.println("Press 5 to update existing Computer Details:");
    	System.out.println("Press 6 to EXIT:");

    	Scanner scan = new Scanner(System.in);
    	option = scan.nextInt();
    	scan.nextLine();
    	switch(option){
    		case 1:
    				list.add(Computer.func());
    				break;
    		case 2:
    				//System.out.println("The Details of all the Computers entered so far are:");
    				System.out.println(list);
    				break;
    		case 3:
    				Computer.search();
    				break;

            case 4: Computer.delete();
            break;
    		
    		case 5: Computer.update();
            break;
            default:
    			System.out.println("Type Correct values"); 
    	}
    }
 
    
	}
}

 

 
class Computer{

    private String brand, color;
    private int hddSize, ramSize, ID;
 
    

    static Object func(){
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Enter the brand:");
	    	String b= scan.nextLine();
	    	System.out.println("Enter the color:");
	    	String c = scan.nextLine();
	    	System.out.println("Enter the hddSize:");
	    	int h= scan.nextInt();
	    	System.out.println("Enter RAM size:");
	    	int r= scan.nextInt();
	    	System.out.println("Enter the ID");
	    	int id= scan.nextInt();
	    	return new Computer(b,c,h,r,id);
    }

    static void search(){
    	Scanner scan1 = new Scanner(System.in);
    				System.out.println("Enter the ID of the computer:");
    				Integer n= scan1.nextInt();
    				for(Object values:EmployeeComputerAPI.list){
    					Computer ref = (Computer)values;
    					System.out.println("The id is:"+ ref.getID());
                        System.out.println("The brand is:"+ ref.getBrand());
                        System.out.println("The Color is:"+ ref.getColor());
                        System.out.println("The hddSize is:"+ ref.getHddSize());
                        System.out.println("The RamSize is:"+ ref.getRamSize());
    					if(ref.getID()==n){
    						System.out.println("System Found");
    					}
    				}
    }

    static void delete()
    {
        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter the ID of computer");

        Integer d=scan2.nextInt();
        for(Object values:EmployeeComputerAPI.list)
        {
            Computer ref=(Computer)values;
            if(ref.getID()==d)
            {
                EmployeeComputerAPI.list.remove(ref);
                System.out.println("Deleted Successfully");
            }

            else
                System.out.println("No such Id Exists");
            break;
        }

    }

   static void update()
    {
        Scanner scan3=new Scanner(System.in);
        System.out.println("Enter the ID of computer");

        Integer d=scan3.nextInt();
        for(Object values:EmployeeComputerAPI.list)
        {
            Computer ref=(Computer)values;
            if(ref.getID()==d)
                {
                    System.out.println("Press 1 to update color");
                    System.out.println("Press 2 to update brand");
                    System.out.println("Press 3 to update Hdd");
                    System.out.println("Press 4 to update Ram");

                    Integer op2=scan3.nextInt();
                    scan3.nextLine();

                    switch(op2)
                    {
                        case 1:
                        System.out.println("Type new Color");
                        String newcolor=scan3.nextLine();

                        ref.color=newcolor;
                        break;
                    

                        case 2:

                        System.out.println("Type new Brand");
                        String newbrand=scan3.nextLine();

                        ref.brand=newbrand;
                        break; 

                        case 3:
                         System.out.println("Type new HDDSIZE");
                         int newhddsize=scan3.nextInt();

                        ref.hddSize=newhddsize;
                        break; 

                        case 4:
                         System.out.println("Type new RamSize");
                            int newramsize=scan3.nextInt();

                        ref.hddSize=newramsize;
                        break; 
                    }

                }
        }

    } 

    Computer(String brand, String color, int hddSize, int ramSize, int ID){
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.ID = ID;
    }
 
    public String getColor(){
        return this.color;
    }
 
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }

    public Integer getID(){
    	return this.ID;
    }
 
    @Override
    public String toString(){
        return this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ", " + this.getID();
    }
 
 
}