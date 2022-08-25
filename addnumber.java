public class leastcd{
  void add()
{
 int a=3;
 int b=6;
 int lcm=0;
   int max=a>b?a:b;
  while(true){

 if(a%max==0)&&(b%max==0)
  {
  lcm=max;
   break;
   }
 System.out.pritnln(lcm);
 max++;
 }
}
 public staic void main(String arg[]){
  lcm in=new lcm();
      in.add();
   }
}
