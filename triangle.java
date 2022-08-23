public class triangle{
 void main()
{
   for(int row=1;row<=9;row++)
  {
     for(int i=8;i>=row;i--)
     { 
      System.out.print(" ");
      }
     for(int col=1;col<=row;col++)
       {

       System.out.print("*");
      }
   for(int col2=1;col2<row;col2++)
      {
        System.out.print("*");
      }
       System.out.println("");
      }
   }
 public static void main(String arg[]){
 triangle me=new triangle();
          me.main();
  }
 }
