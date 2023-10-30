import java.util.*;
abstract class Shape
{abstract void numofsides();
 {
 }
}
class Rectangle extends Shape
{void numofsides()
 {System.out.print("Rectangle has 4 sides.");
 }
}
class Triangle extends Shape
{void numofsides()
 {System.out.print("Triangle has 3 sides.");
 }
}
class Hexagon extends Shape
{void numofsides()
 {System.out.print("Hexagon has 6 sides.");
 }
}

class Shape1
{public static void main(String args[])
 {Scanner s=new Scanner(System.in);
 Rectangle r=new Rectangle();
  Triangle t=new Triangle();
  Hexagon h=new Hexagon();
while(true)  
{
System.out.println("1:RECTANGLE\n2:TRIANGLE\n3:HEXAGON\n4.exit\n");
System.out.println("enter your choice");
int ch=s.nextInt();
if (ch==4)
{
	System.out.println("exiting program");
	break;
}

switch(ch)
{
case 1:r.numofsides();
       break;
case 2:t.numofsides();
       break;
case 3:h.numofsides();
       break;
default:System.out.println("Wrong choice");
        break;
}
}
}
}
