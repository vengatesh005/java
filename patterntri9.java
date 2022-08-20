public class patterntri9{
  void add()
{
   for (int row=1; row<=4;row++)
   {
    for (int space=1;space<row;space++)
       {
      System.out.print(" ");
       }
    System.out.println();
     }
   for (int no1=4; row>=no1;no1--)
    {
for (int no2=2;col>row;col--)

   {
 System.out.print("*");
   }
 System.out.println("*");
    }
 for (int row=1; row<=4;row++)
   {
    for (int space=1;space<=row;space++)
       {
      System.out.print(" ");
       }
    System.out.println();
     }
   for (int row=1; row<=col;col++)
    {
for (int col=3; col>=row;col--)

   {
 System.out.print("*");
   }
 System.out.println();
    }
  }

    



public static void main (String arg[]){
 patterntri9 vengat=new patterntri9();
            vengat.add();
}
  }
