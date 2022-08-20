class  vehicles {
   void moving()
    {
   System.out.println("Start our ride ");
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
public class vehicles2{

public static void main(String args[]){
    car me1=new car();
        me1.moving();
        me1.bus();
        me1.speed();
}
   }

                 
