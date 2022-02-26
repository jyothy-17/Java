


import java.util.*;
class EmployeeDetails
{
  public static void main(String args[])
  {
    Officer obj1=new Officer();
    obj1.readOfficer();
    obj1.displayOfficer();
    obj1.print_salary();
    Manager obj2=new Manager();
    obj2.readManager();
    obj2.displayManager();
    obj2.print_salary();
  }
}
class Employee
{
  Scanner obj=new Scanner(System.in);
  String name,address;
  int age,phno;
  float salary;
  void input()
  {
    System.out.println("Enter Name: ");
    name=obj.nextLine();
    System.out.println("Enter Age: ");
    age=obj.nextInt();
    System.out.println("Enter Phone number : ");
    phno=obj.nextInt();
    obj.nextLine();
    System.out.println("Enter Salary: ");
    salary=obj.nextInt();
  }
  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("Age: "+name);
    System.out.println("Phone no: "+phno);
    System.out.println("Address: "+address);
  }
  void print_salary()
  {
    System.out.println("Salary: "+salary);
  }
  class Officer extends Employee
  {
    String specialisation;
    void readOfficer()
    {
      System.out.println();
      System.out.println("Enter the details of the Officer");
      System.out.println("Enter the specialisation");
      specialisation=obj.nextLine();
    }
    void printOfficer()
    {
       System.out.println();
      System.out.println("Details of the Officer");
      System.out.println("Specialisation: "+specialisation);
      specialisation=obj.nextLine();
    }
  }
  class Manager extends Employee
  {
    String department;
    void readManager()
    {
      System.out.println();
      System.out.println("Enter the details of the Manager");
      System.out.println("Enter the specialisation");
      specialisation=obj.nextLine();
    }
    void printManager()
    {
       System.out.println();
      System.out.println("Details of the Manager");
      System.out.println("Department: "+department);
      specialisation=obj.nextLine();
    }
  }






