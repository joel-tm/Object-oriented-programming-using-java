import java.util.*;
public class Jqueue
{
	int front,rear,x,size,queue[];
	Scanner sc=new Scanner(System.in);
	Jqueue(int s)
	{
		front=-1;
		rear=-1;
		size=s;
		queue=new int[10];
	}
	void enqueue()
	{
	if (rear==size-1)
	{
		System.out.println("Queue is underflow");
	}
	
	else if(rear==-1 && front==-1)
	{
		front=rear=0;
		System.out.println("enter the element to insert");
		x=sc.nextInt();
		queue[rear]=x;
	}
	else
	{
	System.out.println("enter the element to insert");
	x=sc.nextInt();
	rear=rear+1;
	queue[rear]=x;
	}
	}
	void dequeue()
	{
	if(front==-1 && rear==-1)
	{
		System.out.println("queue is underflow");
	}
	else if(front==rear)
	{
	System.out.println("dequed element is"+queue[front]);
	front=-1;
	rear=-1;
	}
	else
	{
	int a;
	a=queue[front];
	System.out.println("dequeued element is "+a);
	front++;
	}
	}
	void peek()
	{
	System.out.println("front element is "+queue[rear]);
	}
	void display()
	{
	 if(front==-1 && rear==-1)
	{
		System.out.println("queue is underflow");
	}
	int i;
	for(i=front;i<=rear;i++)
	{
		System.out.println("queue elements are"+queue[i]);
	}
	}
	public static void main(String[] args)
	{
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the queue");
		s=sc.nextInt();
		Jqueue e=new Jqueue(s);
		while(true)
		{
		
		System.out.println("\n1.enqueue\n2.dequeue\n3.peek\n4.display\n5.exit\n");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		if(ch==5)
		{
			break;
		}
		switch(ch)
		{
			case 1 : e.enqueue();
			break;
			case 2: e.dequeue();
			break;
			case 3: e.peek();
			break;
			case 4: e.display();
			break;
		}
	}
	}
}
		
