interface Shape
{
  abstract void getArea(double dou);
}

  class Rectangle implements Shape
  {
    double length;
    double width;
   
   public Rectangle (double r)
    {
    
    }
    
   public void getArea(String str)
   {
      system.out.println("area="+length*width);
   }
   
  }
  
  
  class Triangle implements Shape
  {
    double base;
    double height;
    
    public Triangle (double r)
    {
    
    }
    
    public void getArea(String str)
    {
      system.out.println("area="+base*height/2);
    }
  }
  
  
}
public class HW2
{
  public static void main(String args[])
  {

  }
}
