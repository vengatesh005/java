 class police_Dgp{
  void  state()
{
        String Dgp= "vengat";
     {
   System.out.println("tamil nadu dgp :"+Dgp);
     }
 
}
 }

 class Igp extends police_Dgp{
 void  district(){

     String Igp="surya";
   {
  System.out.println("chennai igp :"+Igp);
  
   } 
 }
}
 class asp extends Igp{
 void  dist(){

     String asp="vimal";
   {
  System.out.println("kallakurichi asp :"+asp);
  
   } 
 }
}
  
   public class multilevelin{
    public static void main(String arg[]){
  asp vikram=new asp();
             vikram.state();
             vikram.district();
              vikram.dist();
}
  }


