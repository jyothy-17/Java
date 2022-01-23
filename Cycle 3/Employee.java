import java.util.*;
class Employee
  {
  String name;
  int epno,pn;
  void enter details ();
  {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the name:");
    name=obj.nextLine();
    System.out.print("enter the Empo no:");
    epno=obj.nextInt();
    System.out.print("enter phone no:");
    pn=obj. nextInt();
    }
  void print details ()
    {
    System.out.println("Name:"+name);
    System.out.println("Empo no:"+epno);
    System.out.orintln("phone no:"+pn);
    }
  public static void main (String args[])
    {
     int i;
    Employee obj[]=new Employee [50];
    for (i=0;i<5;i++)
      {
       obj[i]=new Employee ();
      obj[i].enter Details ();
      }
    }
  }
