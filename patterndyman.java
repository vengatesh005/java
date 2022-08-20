public class patterndyman{
 void add()
{
  for(int row=1; row<=3; row++)
  {
  for(int colsp=2; colsp>=row; colsp--)
     {
    System.out.print(" ");
     }
   for(int colno=1; colno<=row; colno++)
     {
       System.out.print("*");
     }
    for(int colno1=1; colno1<row; colno1++)
     {
       System.out.print("*");
     }
     System.out.println();
     }  
  for(int row=1; row<=3; row++)
  {
  for(int colsp=1; colsp<=row; colsp++)
     {
    System.out.print(" ");
     }
   for(int colno=3; colno>=row; colno--)
     {
     System.out.print("*");
     }
    for(int colno1=2; colno1>=row; colno1--)
     {
       System.out.print("*");
     }
    System.out.println();
}
   }
  public static void main(String arg[]){
   patterndyman me=new patterndyman();
                me.add();
}
  }
