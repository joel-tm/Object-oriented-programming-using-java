public class MethOver
{
	

    public int sum(int x, int y)
     { return (x + y); }
  
    
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
  
   
    public double sum(int x,double y,int z)
    {
        return (x + y+z);
    }
  
    public double sum(double x,double y)
    {
    	return(x+y);
    }	
    public static void main(String args[])
    {
        MethOver s = new MethOver();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(1,2,3));
        System.out.println(s.sum(1.1, 2.2));
   	System.out.println(s.sum(5,3.3,8));
    }
}

