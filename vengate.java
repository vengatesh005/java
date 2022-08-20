public class vengate{
void add()
{
 int n=77;
 if(n<=0&&n>=9)
{
System.out.print("print the single numberes"+n);
}
   else if(n<=10&&n>=99)
{ 
   int a=n%10;
   int b=n%10;
   int c=a+b;
  System.out.print("print the double number"+c);
 }
}
   public static void main(String arg []){
   vengate vengat=new vengate();
          vengat.add();
  }
}
