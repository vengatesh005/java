public class poly{
  void add()
   {
     int a=10;
     int b=13;
     int c=a+b;
    System.out.println("print the addition "+c);
   }

  void add (int a,int b,int c)
  { 
   int z=a+b+c;
   System.out.println("print the addition "+z);
   }
 void add(float a,float b)
  { 
   float c=a+b;
   System.out.println("print the addition "+c);
   }
   void add(String name,String work)
    {
    System.out.println("Name:"+name+"\n"+"Work:"+work);
    }
  public static void main(String arg[]){
      poly obj=new poly();
          obj.add();
          obj.add(7,8,9);
          obj.add(9.5f,6.7f);
          obj.add("vengatesh","core java");
    }
   
}
