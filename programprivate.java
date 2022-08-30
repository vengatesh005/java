 class A{
  private void name(){

      
           String  name ="vengatesh";      
      {
        System.out.println( " String name");
       }
    }
  }
    class B  extends  A{
       public void pin()
        {
        int pin=1234;
        {
       System.out.println( pin);
      }
   } 
  }
class C  extends  B{
       public void branch()
        {
        String branch="kallai";
        {
       System.out.println( branch);
      }
   } 
  }
 
   public class programprivate{
   public static void main (String arg[]){
             A me=new A();
               me.name();
             B me1=new B();
                me1.pin();
             C me2=new C();
               me2.branch();

  }

}
