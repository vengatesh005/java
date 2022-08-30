public class happyno{
  void add()
  {
 int a=0;
 int b=0;
 int sum=0;
 int n=23;
   while(n>=9)
   { 
   a=n%10;
   b=n/10;
  sum=(a*a)+(b*b);
  n=sum;
   }
 System.out.println(n);
   
    if(n==1)
    {
    System.out.println("happy number");
 
    }
     else
    {
    System.out.println("not happy number");
 
     }
}
public static void main(String args[]){
  happyno me=new happyno();
         me.add();
  }
}
