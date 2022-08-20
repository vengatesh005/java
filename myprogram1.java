public class myprogram1{
  void add()
{
    int a=10;
    int b=5;
   int c=a+b;
 
    System.out.println("print the addtion number:"+c);
  }

    public void add(int a,int b)
  { 
  
  int c=a+b;
  
System.out.println("print the addtion number:"+c);
  }
  public void sub()
  { 
   int a=11;
    int b=56;
   int c=a-b;
  
    System.out.println("print the sub number:"+c);
}
  public void sub (int a,int b)
{
   int c=a-b;
  
System.out.println("print the sub number:"+c);
 }
   public void multi()
{
    int a=10;
    int b=5;
   int c=a*b;
 
    System.out.println("print the mul number:"+c);
  }

    public void multi(int a,int b)
  { 
  
  int c=a*b;

 System.out.println("print the mul number:"+c);
  }
public void division()
{
    int a=10;
    int b=5;
   int c=a/b;
 
    System.out.println("print the mul number:"+c);
  }

    public void division(int a,int b)
  { 
  
  int c=a/b;

 System.out.println("print the mul number:"+c);
}
   public static void main(String arg[]){
    myprogram1 number=new  myprogram1();
              number.add();
              number.add(4,5);
              number.sub();
              number.sub(6,4);
              number.multi();
              number.multi(2,6);
              number.division();
              number.division(10,3);
   }
} 











