import java.util.*;
public class gar
  {
    public static void main (String args[])
      {
       gar obj=new gar();
       obj=null;
       gar a=new gar();
       gar b=new gar();
       b=a;
      System.gc()
       }
      Protected void finalize() throw throwable
        {
        System.out.println("Garbage collection ids done by jvm");
        }
    }
  
