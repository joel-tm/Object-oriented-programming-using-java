import java.util.*;

public class trycatch
{
	public static void main(String[] args)
	{
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size ");
	num=s.nextInt();
	
	try
	{
	int a[]=new int[num];
	
	}
	catch(NegativeArraySizeException e)
	{
	System.out.println(e);
	}
   }
}
