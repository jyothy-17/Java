import java.util.*;
class employee
  {
  Scanner obj=new Scanner(System.in);
  string name,addr;
  int age,phno;
  float salary;
  void input()
    {
    System.out.print("enter the name");
    name=obj.nextLine();
    System .out.print("enter the age");
    age=obj.nextInt();
    System.out.print("enter the PhoneNo");
    phno=obj.nextInt();
    System.out .print("enter the address");
    addr=obj.nextLine();
    System.out.println("enter the salary");
    salary=obj.nextInt();
    }
  void display()
    {
    System.out.println("Name:"+name);
 
      System.out.ptintln("Age:"+age);
      System.out.println("PhoneNo:"+phno);
      System.out.println("Address:"+addr);
      }
      void print_salary()
        {
        System.out.println();
        System.out.println("Detail of the officer");
        System.out.println("Specialisation:"+Specialisation);
        }
     }
  class Manager extends employee
  {
  string department
  void manager_read()
  {
  System.out.println("\n");
  System.out.println("enter the following details of the manager");
  System.out.println("enter the  Department");
  department=obj.nextLine();
  }
  void Manager_print()
  {
  System.out.println("\n");
  System.out.println("Detail of the manager");
  System.out.println("Department:"+department);
  }
  }
  class emploinherit
    {
    public static void main (String args[])
      {
      Officer obj1=new Officer();
      obj1.Officer_read();
      obj1.input();
      obj1.Officer_print();
      obj1.display();
      obj1.print_salary();
      Manager obj2=new Manager ();
      obj2.Manager_read();
      obj2.input();
      obj2.Manager_print();
      obj2.display();
      obj2.print_salary();
      }
    }
       


    

  

