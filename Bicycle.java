  class Cycle
{
   int wheel=2;
  void moving()
  {

  System.out.println("slow");  
  }
 }
    
class SportsCycle extends Cycle
{
  void moving()
  {
    System.out.println("speed");
   }
  }

public class Bicycle{

public static void main(String arg[]){
  Cycle me=new SportsCycle();
          me.moving();
  }
}

