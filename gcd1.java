public class gcd1{
  void add()
    {
int a=12;
int  b=30;
 int gcd=0;
 int min=(a<b)? a:b;
    while(true)
{
  if(a%min==0&&b%min==0)    
   {
  gcd=min;
  break;
   } 
   min--;
   }
 System.out.println(gcd);
}
 
public static void main(String arg[]){
  gcd1 in=new gcd1();
      in.add();
   }
}
