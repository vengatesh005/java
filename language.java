public class language{
 void swap()
  {
   String a="java";
   String b="php";
     String  temp=a;            
            a=b;
            b=temp;
        System.out.println("aftre swapping");
        System.out.println("a is"+a);
        System.out.println("b is"+b);
          }
 
 public  static void main(String arg[]){
 language vengat=new language();
     vengat.swap();
  }
}
