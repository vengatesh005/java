public class number7{
  void add()
{ 
  int row=1;
  while(row<=4)
 {
   int col=1;
   while(col<=4)

  {
if (col==2 || col==3)
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
   number7 vengat=new number7();
            vengat.add();
}
}
