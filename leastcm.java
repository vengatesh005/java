public class leastcm{
  void add()
{
 int a=3;
 int b=7;
 int lcm=0;
   int max=(a>b)?a:b;
  while(true){

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
  leastcm in=new leastcm();
      in.add();
   }
}

