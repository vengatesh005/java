public class primenumber1{
  void primecheck()
   {
    int count=0;
    int s=1;
   boolean flag=false;
   int n=22;
     while(s<=n/2)
  {
   if(n%s==0)
   {
   count++;
   }
   if(count>2)
    {
         flag=true;
     break;
    }
s++;
}
    if(flag==true)
       {
       System.out.println("not prime number");
       }
        else
         {
       System.out.println(" prime number");
         }
       System.out.println(count);
         }    
       public static void main(String arg[]){
       primenumber1 vengat=new primenumber1();
            vengat.primecheck();

     }
}
