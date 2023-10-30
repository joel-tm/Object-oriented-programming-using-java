import java.util.*;
import java.lang.*;
public class FuncString
{
	public static void main(String[] args)
	{
		//String str;
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine();
		while(true)
		{
			System.out.println(" ");
			System.out.println("1.length of string");
			System.out.println("2.to uppercase");
			System.out.println("3.to lowercase");
			System.out.println("4.concatenate");
			System.out.println("5.special charecter");
			System.out.println("6.exit");
			
			System.out.println("enter your choice:");
			
			ch=s.nextInt();
			
			if(ch==6)
			{break;}	
		
			
			switch(ch)
			{
				case 1:
				
					System.out.println("length is "+str.length());
					break;
				case 2:
					System.out.println("uppercase string is: "+str.toUpperCase());
					break;
				case 3:
					System.out.println("lowercase string is: "+str.toLowerCase());
					break;
				
				case 4:
					String str3,str2;
					Scanner s1=new Scanner(System.in);
					System.out.println("enter the second string");
					
					str2=s1.nextLine();
					str3=str.concat(str2);
					System.out.println("concatened string is " +str3);
					break;
					
				case 5:
					System.out.println("\'"+str+"\'");
					break;
			}
			}
			}
			}
					
					
			
			
