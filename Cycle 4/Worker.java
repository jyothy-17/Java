
class employee
  {
  void display ()
    {
    System.out.println("Name of class is employee");
    }
  void calcsalary()
    {
    System.out.println("salary of the employee is RS 10000");
    }
  }
class Engineer extends employee
{
void calcsalary()
{
super.calcsalary()
System.out.println("salary of the engineer is RS 20000");
}
}
class Worker
  {
  public static void main (String args[])
    {
    Engineer e=new Engineer();
    e.display();
    e.calcsalary();
    }
  }
