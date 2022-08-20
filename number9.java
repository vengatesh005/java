public class number9{
  void add()
{ 
  int row=1;
  while(row<=4)
 {
   int col=1;
   while(col<=4)

  {
if (col==row||col+row==5)
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
   number9 vengat=new number9();
            vengat.add();
}
}
