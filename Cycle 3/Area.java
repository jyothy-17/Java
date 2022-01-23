import java.util.*;
 class Area
   {
   public static void main (String args[]);
   {
     Scanner obj=new Scanner (System.in);
     System.out.println("enter the radius of circle :");
     int a=obj.nextInt();
     System.out.print("enter the length and breadth of the rectangle:");
     int b=obj.nextInt();
     int c=obj.nextInt();
     System.out.println("enter the base and height of the triangle:");
     float d=obj.nextInt();
     float e=obj.nextInt();
     Shapes obj1=new Shape();
     obj1.area(a);
     obj.area(b,c);
     obj.area(d,e);
     }
   }
   class  Shape
     {
     void area(int r)
       {
       double Area=(3.14*r*r;)
         System.out.println("Area of circle="+Area);
       }
     void  area(intl,intb)
       {
       double area=l*b;
       System.out.println("Area of Rectangle="+Area);
       }
     void area(float b,float h)
     {
       double area=(h*b)/2;
       System.out.println("Area of triangle=");
       
       }
     }
             
