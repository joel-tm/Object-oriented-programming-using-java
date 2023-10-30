import java.util.Scanner;

public class Area
{
	int length,breadth;
	int area;
	void setDim(int len,int bre)
	{
		length=len;
		breadth=bre;
	}
	
	int getArea()
	{area=length*breadth;
	 return area;
	}
	
	public static void main(String[] args)
	{
		int len,bre;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length");
		len=s.nextInt();
		System.out.println("enter the breadth");
		bre=s.nextInt();
		
		Area a=new Area();
		a.setDim(len,bre);
		System.out.println("area is "+a.getArea());
		
		//System.out.println("
	}
	
}
	
