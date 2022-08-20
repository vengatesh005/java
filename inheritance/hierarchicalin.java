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
  void  army()
     {    
        String  genral= "army";
        {
   System.out.println("indian:"+genral);
        }
    }
}
class navy extends protector{
   void navy()
    { 
        String chief= "navy";
        {
   System.out.println("indian:"+chief);
     }
        }
 }

   public class hierarchicalin{
    public static void main(String arg[]){
  army people=new army();
             people.main();
             people.army();
  navy people1=new navy();
             people1.main();
             people1.navy();
}

  }


