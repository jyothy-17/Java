import java.io.util.*;
class Threadsumcube
  {
  public static void main (String args[])
    
  {
    thread1 t1=new thread1;
    t1.start();
    
    }
  }
class thread1 extends thread
{
public void run()
{
int i,n,l;
Scanner sc=new Scanner(System.in)
 System.out.println("enter the number of random integer to be inserted:");
 n=sc.nextInt();
 System.out.println(" entet the time limit factor which can be replaced:");
 l=sc.nextInt();
 Random r=new Random();
 for(i=0;i<=n;i++)
 {
 int Random;
 System.out.println("Random integer is:");
 Random=r.nextInt(l);
 if(Random%2==0)
 {
 square s =new square(Random);
 s.start();
 }
 else
 {
 cube c=new cube(Random);
 c.start();
 }
 try
 {
 thread sleep (1000);
 }
 catch(Expection e)
 {
 System.out.println(e);
 }
 }
 }
 }
 class square extends Thread
 
 {
 int n;
 square (int n)
 {
 this.n=n;
 }
 public void run()
 {
 System.out.println("square of"+this.n""+(this.n* this.n));
 
 }
 }
 class cube extends Thread
 {
 int n;
 cube(int n);
 {
 this.n=n;
 }
 public void run()
 {
 System.out.println("cubebof"+this.n""+(this.n*this.n));
 }
 }
 }
 
 
 
 
 
