import javs.util.*;
class Perimeter
  {
  public static void main (String args[])
    {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the radius of circle:");
    int a=obj.nextInt();
    System.out.print("enter the length and breadth of the rectangle":);
    int b=ibj.nextInt();
    int c=obj.nextInt();
    Perimeter obj=new Perimeter(a);
    obj=new Perimeter (b,c);
    }
  }
class Perimeter
  {
  Perimeter(int r)
    {
     double Perimeter=3.14*2*r;
    System.out.println("perimeter of the circle="+Perimeter);
    }
  Perimeter (int l,int b)
    {
    double Perimeter=2*(l+b);
    System.out.println("Perimeter of rectangle="+Perimeter);
    }
  }
 

                                  
