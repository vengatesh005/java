public class gcd111{ 
  void add()
  {
 int a=9;
 int b=15;
 int c=3;
  int min=0;
  int gcd=0;
  if(a<b&&a<c)
   min=a;
  else if(b<c)
   {
    min=b;
    }
 else
  {
  min=c;  //min value store//
   }
  while(true){
   if(a%min==0 && b%min==0&& c%min==0)
   {
       gcd=min;
        break;
        }
     min--;
     } 
 System.out.println(gcd);
   }
 public  static void main(String arg[]){
   gcd111 in=new gcd111();
          in.add();
    }
 }   
