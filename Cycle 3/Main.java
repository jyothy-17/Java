import java. util.*;
class main
  {
    public static void main (String args[])
      {
        Student obj1=new Student ();
      obj1.Student_read();
      obj1.Student_print();
      }
  }
class Student
  {
  intn,i,r;
  string name;
  int sub[]=new int[5]
    

void   student_read()
 {
    Scanber ibj=new Scanner (System.in);
    System.out.println("enter the name:");
    name=obj.nextLine();
    System.out.println("enter the roll number:");
    r=obj.nextInt();
    for (i=0;i<5;i++)
      {
       System.out.println("enter the mark of sub"+(i+1)+"=");
      sub[i]=obj.nextInt();
      }
    }
  void student_print()
    {
    System.out println("\n");
    System.out.println("Name:"+name);
    System.out.println("Roll no:"+r);
    for(i=0;i<5:i++)
      {
   
       System.out.println("mark of sub"+(i+1)+""="+sub[i]);
          }                

   }
   }
