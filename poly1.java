class vehicle{
  void driving()
{
  System.out.println("driving car");

 }
   }
 class bike extends vehicle{
   void driving()
   {
  System.out.println(" driving bike");
  }
    }
  public class poly1{
  public static void main (String arg[]){
    bike me=new bike();
         me.driving();
  }
 }

  

