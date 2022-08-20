public class pattern11{
  
 void main()
{
  for(int i=1; i<=5;i++)
{
 for(int j=1; j<=i;j++)
    {
  System.out.print("*");
    }
   System.out.println();
}
  for(int i=1; i<=5;i++)
{
 for(int j=5; j>=i;j--)
   {
   System.out.print("*");
    }  
   System.out.println();
  }
}
 public static void main(String arg[]){
   pattern11 me=new pattern11();
             me.main();
   }
 }
