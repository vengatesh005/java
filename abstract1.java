abstract class animal
{
   abstract void animalSound();
  

  void sleep(){
    {
   System.out.println("Zzz");
      }
   }
}
 class pig extends animal
    {
   void animalSound(){
    {

      System.out.println("we wee");
      }
   }
 }
  public class abstract1{
  public static void main(String arg[]){
    pig mypig = new pig();
       mypig.sleep();
       mypig.animalSound();
   }
 }


