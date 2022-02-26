
class Bank7
  {
   public static void main (String args[])
     {
      Account a =new Account ();
      Deposit d=new Deposit (d);
      wthdraw w=new withdraw(w);
      d.start();
      w.start();
     }
  }
       
     class Account
       {
       int amount=500;
       if(this .amount<amount)
         
         {
         try
           {
           wait ();
           }
          catch(Exception e)
            {
            System.out.println(e);
            }
         }
       this.amount=amount;
       if(this.amount<amount)
         {
         System.out.println("withdraw completed");
         System.out.println("available balance:"+this.amount);
         }
       else
         
         
         {
         System.out.println("low balance");
         System.out.println("available balance":+this . amount);
         }
       }
 synchronize void deposit(int amount)
   
{
   this.amount+=amount;
   System.out.println("deposit completed");
   System.out.println("available bslance:"+this.amount);
   notify();
   
   class deposit extends thread
     {
     Account =a;
     
     Deposit (Account);
     {
       this.a=a;
       }
     public void run()
       {
       a.deposit(10000);
    }
     }
   class withdraw extends thread
     {
     Account=a;
   wthdraw(account a)
     
   {
     this.a=a;
     }
     public void run()
       {
       a.withdraw(25000);
      }
     }
       
     
     
     
     
     
   
   
