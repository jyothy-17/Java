









 
class DisplayOdd extends Thread
{
  public void run()
  {
    try {
    System.out.println("Odd numbers between 1 and 100 are:"); 
    for(int i=1;i<=100;i++)
       if(i%2!=0)
         System.out.println(i);
    }
    catch(Exception e)
    { 
      System.out.println(e);
    }
  }
}

class DisplayEven extends Thread
{
  public void run()
  {
    try {
    System.out.println("Even numbers between 1 and 100 are:");  
    for(int i=1;i<=100;i++)
       if(i%2==0)
          System.out.println(i);
    }
    catch(Exception e)
    { 
      System.out.println(e);
    }
  }
}

class Multi
{
     public static void main(String args[]) throws Exception
     {
        try
          {
             DisplayOdd o = new DisplayOdd();
             DisplayEven e = new DisplayEven();
             o.start();
             o.join();
             e.start();
          }
        catch(Exception e)
          {
             System.out.println(e);
          }
     }
}
  

 
 
