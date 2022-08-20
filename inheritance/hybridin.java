class protector{
  void  main()
    { 
        String information= "war alert ";
       {
   System.out.println("Message:"+information);
       }
    }
}

class army extends protector{
  void  commander()
     {    
        String  genral= "army";
        {
   System.out.println("indian:"+genral);
        }
    }
}
 class police extends protector{
  void  state()
{
        String Dgp= "vengat";
     {
   System.out.println("tamil nadu dgp :"+Dgp);
     } 
 
}
 }

 class Igp extends police{
 void  district(){

     String Igp="surya";
   {
  System.out.println("chennai igp :"+Igp);
  
   } 
 }
}
 class asp extends Igp {
 void  dist(){

     String asp="vimal";
   {
  System.out.println("kallakurichi asp :"+asp);
  
   } 
 }  
}
  public class hybridin{
  public static void main(String arg[]){
  asp vikiram=new asp();
      vikiram.main();
      vikiram.state();
      vikiram.district();
      vikiram.dist();
army vikiram1=new army();
      vikiram1.commander();
  
  
}
  }






