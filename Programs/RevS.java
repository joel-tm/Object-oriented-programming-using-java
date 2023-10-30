import java.util.*;
import java.lang.*;
public class RevS
{
	public static void main(String[] args)
	{	int ch;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine();
		String revstr="";
		while(true)
		{
			System.out.println(" ");
			System.out.println("1.reversing a stirng");
			System.out.println("2.check string for pallindrome");
			System.out.println("3.exit");
			System.out.println("enter your choice:");
			
			ch=s.nextInt();
			
			if(ch==3)
			{break;}
			
			switch(ch)
			{
				case 1: 
					char character;
					int i;
					int n;
					n=str.length();
					for(i=n-1;i>=0;i--)
					{	character=str.charAt(i);
						revstr=revstr+character;		
					}
					System.out.println("reversed string is "+revstr);	
					break;
			
				case 2:
					String str2;
					String revstr2="";
					Scanner s2=new Scanner(System.in);
					System.out.println("enter the string for pallindrome");
					str2=s2.nextLine();
					int n2;
					n2=str2.length();
					char character2;
					for(i=n2-1;i>=0;i--)
					{
						character2=str2.charAt(i);
						revstr2=revstr2+character2;
						
				
					}
					//System.out.println("reversed string is "+str2);
					//System.out.println("reversed string in var revstr2 is "+revstr2);
					if(str2.equals(revstr2)){System.out.println("string is pallindrome");}   
			}

			}
			}
			}
			
