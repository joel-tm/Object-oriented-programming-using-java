public class Rectangle
{
	double length,breadth;
	Rectangle()
	{
		length=10;
		breadth=20;
	}
	Rectangle(double a)
	{
		length=a;
		breadth=a;
	}
	Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	double area()
	{
	return(length*breadth);
	}
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(30.0);
		Rectangle r3=new Rectangle(40.1,10.2);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());
		
	}
}
