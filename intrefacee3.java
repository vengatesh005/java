  interface vehicle
    {  
    void car();
    void bike();
    void bus();
    }
     interface  Human
  {
  void maximum(int height,int weight);
  }
  class travel implements vehicle,Human{
  public  void car()
      {
     System.out.println("car loading capacity 4 members");
      }
    
  
  public void bike()
     {

     System.out.println("car loading capacity 2 members");
   }
  public void bus()
       {
      System.out.println("car loading capacity 2 members");
       }
    }
   public void maximum(int height,int weight)
    {
        System.out.println("human"+height +"\n"+"Human"+ weight);   
    }
public class interfacee3{
  public static void main (String arg[]){
   travel me=new travel();
          me.car();
          me.bike();
          me.bus();
          me.maximum();
   }
 }
 
  
