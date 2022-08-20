public class number8{
  void add()
{ 
  int row=1;
  while(row<=4)
 {
   int col=1;
   while(col<=4)

  {
if (row==1 || row==4 ||col==1 || col==4)
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
   number8 vengat=new number8();
            vengat.add();
}
}
