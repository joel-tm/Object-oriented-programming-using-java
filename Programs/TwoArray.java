
import java.util.*;

public class TwoArray
{
	public static void main(String Args[])
	{
	int  ch,m,n,p,q;
	boolean flag=true;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the number of rows and columns of 1st Matrix");
	m=s.nextInt();
	n=s.nextInt();
	System.out.println("Enter the number of rows and columns of 2nd Matrix");
	p=s.nextInt();
	q=s.nextInt();
	int a[][]=new int[m][n];
	int b[][]=new int[p][q];
	int c[][]=new int[m][n];
	int d[][]=new int[m][q];
	System.out.println("Enter the elements of 1st Matrix");
	for(int i=0;i<m;i++)
	  for(int j=0;j<n;j++)
		a[i][j]=s.nextInt();
	
	System.out.println("Enter the elements of 2nd Matrix");
	for(int i=0;i<p;i++)
	  for(int j=0;j<q;j++)
		b[i][j]=s.nextInt();
	
	while(flag)
	{
	System.out.println("1.Sum of Matrices");
	System.out.println("2.Product of Matrices");
        System.out.println("3.Exit");
	System.out.println("Enter your choice:");
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
		if(m!=p || n!=q)
		 System.out.println("Sum is not possible");
		else
		 {
		   System.out.println("Sum is:"); 
		   for(int i=0;i<m;i++)
	  	   {	
			for(int j=0;j<n;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
			System.out.println("");	
		   }
		 }
		break;
 	case 2:
		if(n!=p)
		  System.out.println("Product is not possible");
		else
		{
		  System.out.println("Product is:");
		   for(int i=0;i<m;i++)
	  	   {	
			for(int j=0;j<q;j++)
			{
			   d[i][j]=0;
			   for(int z=0;z<n;z++)
			   {
				d[i][j]=d[i][j]+ a[i][z]*b[z][j];
			
			   }			
				System.out.print(d[i][j]+" ");
			}
			System.out.println("");	
		   }
		}
		break;
	case 3:
		flag=false;
		break;
	default:
		System.out.println("Invalid choice");
	}
	}
	}
}