class pattern{
  void program()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=4;j++)
     { 
     if(i==1&&i||j==1||i==3||j== 4)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
       } 
     }

class pattern1 extends pattern{
  void program1()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=4;j++)
     { 
     if(i==1||j==1||i==3||i== 5 || j==4)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
       } 
     }
class pattern2 extends pattern1{
  void program2()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if(i==1||j==1||i==5)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
       } 
     }class pattern3 extends pattern2{
  void program3()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if  ((i==1&&j<5)||(i==5&&j<5)||(j==5&&i>1&&i<5)||j==2)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
       } 
     }

  public class pattern111{

public static void main (String arg[]){
 pattern3 vengat=new pattern3();
           vengat.program();
           vengat.program1();
           vengat.program2();
           vengat.program3();

}
}
