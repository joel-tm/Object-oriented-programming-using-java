import java.util.*;
public class Armstrong
{	public static void main(String args[])
	{	
	int n,temp,r,count=0,temp1;
	double sum=0.0;//because return type of math.pow is double
	System.out.println("enter the number ");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	temp=n;// because if we do it in while loop with n the original value of n gets changed
	while(temp>0)
	{
		temp=temp/10;
		count=count+1;
	}
	temp1=n;//in case if we want to print the original number again thats why we dont do it 
	while(temp1>0)
	{
	r=temp1%10;
	sum=sum+Math.pow(r,count);// each digit is seperately taken and raised to power of number of digits
	temp1=temp1/10;
	}
	
	//System.out.println(sum);
	if(sum==n)
	{
	System.out.println(n+"is a armstrong number");
	}
	else
	{
	System.out.println(n+"is not a armstrong number");
	}
	//System.out.println(r);

	}
}

