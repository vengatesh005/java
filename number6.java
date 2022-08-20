public class number6{
  void add()
{ 
  int row=1;
  while(row<=4)
 {
   int col=1;
   while(col<=4)

  {
if (col==row)
{
     System.out.print(0);
    
  }
 else
    {
     System.out.print("1");
    }
    col++;
    }
   System.out.println();
        
    row++;
  }
} 
  public static void main(String arg[]){
   number6 vengat=new number6();
            vengat.add();
}
}
