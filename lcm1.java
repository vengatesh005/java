public class lcm1{
 void add()
  {
 int a=10;
 int b=15;
 int lcm=0;
int max=(a>b)?a:b;
 while(true)
{
  if(max%a==0 && max%b==0)
   {
      lcm=max;
       break;
   }
     max++;
    }
   System.out.println(lcm);
    }
   public static void main(String arg[]){
  lcm1 in=new lcm1();
      in.add();
   }
}
   
 
