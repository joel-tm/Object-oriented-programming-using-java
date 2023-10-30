import java.util.*;
interface Test
{public void square(int n);
}

class Arithmetic implements Test
{public void square(int n)
 {System.out.print("Square of the number:"+n*n);
 }
}

class Totest
{public static void main(String args[])
 {Scanner s=new Scanner(System.in);
  Arithmetic a=new Arithmetic();
  System.out.print("Enter the number:");
  int n=s.nextInt();
  a.square(n);
 }
}
