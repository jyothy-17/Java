import java.util.*;
class Fibanocci
  {
   public static void main (String args[])
     {
       int i;
       int n1=0,n2=1,n3;
     Scanner obj=new Scanner (System.in);
     System.out.println("enter the number of fibanocci series ");
     int count=obj.nextInt();
     System.out.println("fibanocci series is");
     System .out.println(""+n1);
     System.out.println(""+n2);
     for(i=2;i<count;i++)
       {
       n3=n1+n2;
       System.out.println(""+n3);
       }
     }
  }
