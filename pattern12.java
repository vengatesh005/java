public class pattern12{
  
 void main()
{
  for(int i=1; i<=5;i++)
{
 for(int v=4; v>=i;v--)
   {
  System.out.print(" ");
   }
 for(int j=1; j<=i;j++)
  {
 System.out.print("*");
  }
for(int j=1; j<=i;j++)
    {
  System.out.print("*");
    }
System.out.println();
} 
  for(int i=1;i<=5;i++)
{
 for(int v=1; v<i;v++)
   {
  System.out.print(" ");
   }
 for(int j=5; j>=i;j--)
  {
 System.out.print("*");
  } 
for(int j=5; j>=i;j--)
   {
   System.out.print("*");
    }  
 System.out.println();
  }
}  

     
public static void main(String arg[]){
   pattern12 me=new pattern12();
             me.main();
   }
 }
