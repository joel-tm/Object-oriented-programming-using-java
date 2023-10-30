import java.util.*;
public class Employee
{
	int salary;
	String name;
	int hours;
	
	void getinfo(int sal,String n,int hrs)
	{
	salary=sal;
	name=n;
	hours=hrs;
	}
	
	void addsal()
	{
	if(salary<500)
	salary=salary+10;
	}
	//System.out.println("salary after inputing existing salary is"+salary);
	
	
	void addwork()
	{
	if(hours>6)
	{
	salary=salary+5;
	}
	System.out.println("Final salary is  "+salary);
	}
	
	
	public static void main(String[] args)
	{
	int sal;
	String n;
	int hrs;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the salary of employee");
	sal=s.nextInt();
	System.out.println("enter the name of employee");
	Scanner s1=new Scanner(System.in);
	n=s1.nextLine();
	System.out.println("enter the number of working hours");
	hrs=s.nextInt();
	
	Employee e=new Employee();
	e.getinfo(sal,n,hrs);
	e.addsal();
	e.addwork();
	//e.fin();
	}
	}
	
	
	
	
	
