import java.util.*;
public class Rfact
{
	int number,result;
	int fact(int n)
	{
	number=n;
	if(n==1 || n==0)
	{
	return 1;
	}
	else
	{
	result=n*fact(n-1);
	return result;
	}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		Rfact e=new Rfact();
		
		System.out.println("factorial is "+e.fact(n));
	}
}
