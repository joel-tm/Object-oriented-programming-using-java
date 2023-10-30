
import java.util.*;
public class ArithmeticOps
{
	public static void main(String[] args) 
	{int ch,a,b,c;
	char m;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	    do{
	        System.out.println("menu");
	        System.out.println("1.sum of numbers");
	        System.out.println("2.Differnce of numbers");
	        System.out.println("3.product of numbers");
	        System.out.println("4.qoutient of numbers");
	        System.out.println("5.remainder of numbers");
	        System.out.println("enter the choice");
	        ch=s.nextInt();
	        switch (ch)
	        {
	            case 1:
	            c=a+b;
	            System.out.println("sum of numbers=" +c);
	            break;
	            case 2: 
	            c=a-b;
	            System.out.println("difference of numbers "+ c);
	            break;
	            case 3:c=a*b;
	            System.out.println("product of numbers "+c);
	            break;
	            case 4: c=a/b;
	            System.out.println("qoutient of numbers " +c);
	            break;
	            case 5:
	                c=a%b;
	                System.out.println("remainder of numbers" +c);
	                break;
	           default:
	                    System.out.println("wrong choice");
	                    break;
	           
	        }
		System.out.println("do you want to continue: (y/n)");
		m=s.next().charAt(0);
	}
	while(m=='y'|| m=='n');
}
}

