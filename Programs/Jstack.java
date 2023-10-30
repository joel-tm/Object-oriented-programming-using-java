import java.util.*;
public class Jstack
{
	int stack[],top,x,size;
	Jstack(int s)
	{
		size=s;
		stack=new int[10];
		top=-1;
	}
	void push()
	{
		Scanner sc=new Scanner(System.in);
		
		if(top==size-1)
		{
			System.out.println("stack overflow");
		}
		else 
		{
		top=top+1;
		System.out.println("enter the element to insert");
		x=sc.nextInt();
		stack[top]=x;
		}
	}
	void pop()
	{
	if(top==-1)
	{
		System.out.println("stack underflow");
	}
	else
	{
		int a=stack[top];
		System.out.println("deleted element is "+a);
		top=top-1;
	}
	}
	void peek()
	{
	if(top==-1)
	{System.out.println("stack uderflow");}
	else
	{	
	System.out.println("the front element is"+stack[top]);
	}
	}
	void display()
	{
		if(top==-1)
		{
		System.out.println("stack is empty");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println("stack elements are"+stack[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		s=sc.nextInt();
		Jstack e=new Jstack(s);
		while(true)
		{
		
		System.out.println("\n1.push\n2.pop\n3.peek\n4.display\n5.exit\n");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		if(ch==5)
		{
			break;
		}
		switch(ch)
		{
			case 1 : e.push();
			break;
			case 2: e.pop();
			break;
			case 3: e.peek();
			break;
			case 4: e.display();
			break;
		}
	}
	}
}
				
	
	
