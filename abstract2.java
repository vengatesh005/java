abstract class companyl
{
   abstract void officeTime();
  

  void eating()
    {
   System.out.println("launch time");
      }
   
}
 class workers extends companyl
    {
   void officeTime()
    {

      System.out.println("morning entry");
      }
   
 }
  public class abstract2{
  public static void main(String arg[]){
    workers  inobj =new workers();
       inobj.eating();
       inobj.officeTime();
   
 }
}


