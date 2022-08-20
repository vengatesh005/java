public class patterntri1{
  void add()
{
   for (int row=1; row<=3;row++)
   {
    for (int space=1;space<row;space++)
       {
      System.out.print(" ");
       }
  for(int no1=3;no1>=row; no1--)
      {
      System.out.print(no1);
       }
   for(int no2=2;no2>=row;no2--)
      { 
      System.out.print(no2);
      }
  System.out.println();
 }
}
public static void main (String arg[]){
 patterntri1 vengat=new patterntri1();
            vengat.add();
}
  }
