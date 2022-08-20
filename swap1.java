public class swap1{
  void swap()
{
  int a=2;
  int b=5;
   int temp=a;
       a=b;
       b=temp;
  System.out.println("a is"+a);
  System.out.println("b is"+b);
  }
  public static void main(String arg[]){
  swap1 s=new swap1();
        s.swap();
   }
 } 

