interface Shape
{
  abstract void getArea(double dou);
}

  class Rectangle implements Shape
  {
    double length;
    double width;
   
   public Rectangle (double l , double w)
    {
      length = l;
      width = w;
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
    
    public Triangle (double b , double h)
    {
      base=b;
      height=h;
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

    Rectangle rec;
    rec = new Rectangle(3,5);
    rec.getArea();
    
    Triganle tri;
    tri = new Triangle(4,6);
    tri.getArea();
  }
}
