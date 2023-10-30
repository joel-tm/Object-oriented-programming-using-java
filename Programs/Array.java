
import java.util.*;

public class Array
{
	public static void main(String Args[])
	{
	int ch,sum=0,largest,smallest,n;
	boolean Flag=true;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	n=s.nextInt();
	int[] MyList= new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++)		
		MyList[i]=s.nextInt();
	while(Flag)
	{
	System.out.println("1.Print all elements");
	System.out.println("2.Find sum of all elements");
	System.out.println("3.Find largest of the elements");
	System.out.println("4.Find Smallest of the elements");
        System.out.println("5.Exit");
	System.out.println("Enter your choice:");
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
		for(int i=0;i<n;i++)		
		   System.out.println(MyList[i]+" ");
		break;
	case 2:
		for(int i=0;i<MyList.length;i++)		
			sum=sum+MyList[i];				   
		System.out.println("Sum is "+sum);
		break;
	case 3:
		largest=MyList[0];
		for(int i=1;i<n;i++)		
		 if(MyList[i]>largest)
			largest=MyList[i];
		System.out.println("Largest is "+largest);
		break;
	case 4:
		smallest=MyList[0];
		for(int i=1;i<n;i++)		
		 if(MyList[i]<smallest)
			smallest=MyList[i];
		System.out.println("Smallest is "+smallest);
		break;
	case 5:
		Flag=false;
		break;
	default:
		System.out.println("Invalid Choice");

	}
	}
   	}	
}	

