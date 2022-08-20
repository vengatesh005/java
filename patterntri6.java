public class patterntri6{
  void add()
{
   
for(int i=1;i<=4;i++)
{
 for(int j=1;j<=4;j++)
{
  if(i==1 || i==4 || i==2 || i+j==7 || i+j==3 )
    
  System.out.print("*"+"");
    
  else
   
  System.out.print(" ");
    
}
  System.out.println();

 } 
 }
  

public static void main (String arg[]){
 patterntri6 vengat=new patterntri6();
            vengat.add();
}
  }
