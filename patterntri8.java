public class patterntri8{
  void add()
{
   for (int row=1; row<=4;row++)
   {
    for (int space=1;space<=row;space++)
       {
      System.out.print("*");
       }
    System.out.println();
     }
   for (int row=1; row<=3;row++)
    {
for (int col=3; col>=row;col--)

   {
 System.out.print("*");
   }
 System.out.println();
    }
  }

public static void main (String arg[]){
 patterntri8 vengat=new patterntri8();
            vengat.add();
}
  }
