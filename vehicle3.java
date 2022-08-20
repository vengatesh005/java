class  vehicles {
   void moving()
    {
   System.out.println("travelling  ");
    }
}
class Water extends vehicles{
  void ship()

  { String shyling ="largest carrying capacity, smooth shyling";
    {
  System.out.println("ship:" +shyling);
   }
  }
}
class boat extends Water{
  void speed()

  { String rides ="largest tuoristers";
    {
  System.out.println("boat:"+ rides);
   }
  }
}
class land extends vehicles{
 void bus()
  {
System.out.println("largest carrying capacity,tire");
 }
} 
  class car extends land{
   void speed()
    {

    System.out.println("milage");
     }
}
public class vehicle3{

public static void main(String args[]){
    boat obj=new boat();
        obj.moving();          
        obj.ship();
       obj.speed();
   car obj1=new car();
       obj1.moving();
       obj1.bus();

   }
}

                 
