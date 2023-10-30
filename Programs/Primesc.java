import java.util.*;
public class Primesc
{
	public static void main(String[] args)
		{
			int n,i;
			int flag=0;
			System.out.println("enter the number: ");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			if(n==1||n==0)
			{	
				System.out.println(n+" enighter");;
			}
			else
			{
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
				flag=1;
				}
			
			}
			
			if(flag==0)
			{
			System.out.println(n+" is a prime number");	
			}
			else
			{
			System.out.println(n+" is not a prime number");
			}
			}
			
		}
}
