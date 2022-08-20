public class primenumber{
  void primecheck()
{
    int count=0;
    int v=1;
    int n=88;
    while(v<=n)
    {
   if(n%v==0)
      {
    System.out.println("factorial"+v);
     count++;
      }
  v++;
      }
  
      if(count==2)
        {
         System.out.println("prime number");
        }

      else
      {
        System.out.println("not prime number");
      }
        System.out.println(count);
     }
    public static void main(String arg[]){
       primenumber vengat=new primenumber();
            vengat.primecheck();
}


}
