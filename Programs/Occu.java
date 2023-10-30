import java.util.*;
import java.lang.*;
public class Occu
{
	public static void main(String[] args)
	{	int ch;
		
		Scanner s=new Scanner(System.in);
		char character;
		System.out.println("enter the string:");
		String str=s.nextLine();
		//String revstr="";
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the character to search for");
		character=s1.nextLine().charAt(0);
		int n;
		n=str.length();
		for(int i=0;i<n;i++)
		{
			if(character==str.charAt(i))
			{count=count+1;
			}
		}
		System.out.println("frequency is"+count);
	}
}
