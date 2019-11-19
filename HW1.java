abstract class CShape
{
  protected String color;
  public void setColor(String str)
  {
    color = str;
  }
  public abstract void show();
}

 class CTriangle extends CShape
 {
  protected double al,bl,cl;
  public CTriangle (double a, double b, double c)
  {
    al =a;
    bl =b;
    cl =c;
  }
  public void show()
  {
  System.out.print("color="+color+", ");
  System.out.print("area="+0.5*a*b);
  }
 }
 
public class hw1
{
  public static void main(String args[])
  {
    CTriangle tri = new CTriangle(3,4,5);
    tri.setColor("Red");
    tri.show();
  }
}
