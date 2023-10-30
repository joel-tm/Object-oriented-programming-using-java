import java.util.*;
public class Complex
{
    int a,b,c,d;
    Complex(int r1,int im1,int r2,int im2)
    {
        a=r1;
        b=im1;
        c=r2;
        d=im2;
    }
     void add()
     {
        int r=a+c;
        int i=b+d;
        System.out.println("sum is");
        System.out.println(r+"+i"+i);
     }
     void diff()
     {
        int r=a-c;
        int i=b-d;
        System.out.println("Difference is");
        System.out.println(r+"+i"+i);
     }
     void product()
     {
        int r=a*c;
        int i=b*d;
        System.out.println("Product is");
        System.out.println(r+"+i"+i);
     }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number: ");
        int r1=s.nextInt();
        int im1=s.nextInt();
        System.out.println("Enter real and imaginary part of second complex number: ");
        int r2=s.nextInt();
        int im2=s.nextInt();
        Complex c=new Complex(r1,im1,r2,im2);
        c.add();
        c.diff();
        c.product();
    }
}
