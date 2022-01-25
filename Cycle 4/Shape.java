abstract class Shape
  {
  abstract void number of sides();
  }
   class  Rectangle extends Shape
   {
   void number of sides()
   {
    System.out.println("No of side of rectangle is 4);
    }
    }
    class Triangle extends Shape
    {
     void number of sides()
     {
     System.out.println("No of side  of  triangle is 3);
     }
     }
     class Hexagon extends Shape
     {
      void number of sides()
      {
      System.out.println("No of sides of hexagon is 6);
      }
      }
      class Shape
      {
      public static void main (String args[])
      {
      Rectangle r=new Rectangle ();
      r.number of sides();
      Triangle t=new Triangle();
      t.number of sides();
      Hexagon h=new Hexagon();
      h.number of sides();
      }
      }
    
