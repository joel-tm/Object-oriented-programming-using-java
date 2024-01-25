import java.util.*;
class Polynomial
{
int a,b;
Polynomial (int a,int b)
{
this.a=a; 
this.b=b;
}
void add(Polynomial A)
{

System.out.println("added polynomial"); 
int d=A.b+b;
System.out.println(A.a+a+"x+"+d);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter coefficient and constant no of poly 1:");
int a=in.nextInt();
int b=in.nextInt();
Polynomial A=new Polynomial (a,b);
System.out.println("enter coefficient and constant no of poly 2:");
a=in.nextInt();
b=in.nextInt();
Polynomial B=new Polynomial (a,b);
B.add(A);
}
}
