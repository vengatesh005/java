public class lcm111{ 
  void add()
  {
 int a=9;
 int b=5;
 int c=10;
  int max=0;
  int lcm=0;
  if(a>b&&a>c)
   max=a;
  else if(b>c)
   {
    max=b;
    }
 else
  {
  max=c;  //max value store
   }
  while(true){
   if(max%a==0 && max%b==0&& max%c==0)
   {
       lcm=max;
        break;
        }
     max++;
     } 
 System.out.println(lcm);
   }
 public  static void main(String arg[]){
   lcm111 in=new lcm111();
          in.add();
    }
 }   

   

