public class patterntri{
  void add()
{
   
for(int i=1;i<=5;i++)
{
 for(int j=1;j<=5;j++)
{
  if(i==1 || i+j==5)
   { 
  System.out.print("*");
    }
  else
   {
  System.out.print(" ");
    }
  System.out.println();
}
 }
}
  

public static void main (String arg[]){
 patterntri vengat=new patterntri();
            vengat.add();
}
  }
