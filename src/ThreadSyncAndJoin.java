public class ThreadSyncAndJoin {
    private static int  count=0;
    public static synchronized void incount() {

        count++;
        
    }
 public static void main(String[] args) 
 {
       Thread obj1=new Thread(new Runnable()
        {
         public void run()
         {
               for(int i=0;i<10000;i++)
               {
                incount();
               }
         }
       }
         );
       Thread obj2=new Thread(new Runnable() 
       {
     public void run()
     {
           for(int i=0;i<10000;i++)
           {
            incount();
           }
     }
   }
     );
       obj1.run();
       obj2.run();
       System.out.println("Value is :"+count);

 }

}