public class patterns1{
  void main()
{
  for(int row=1; row<=4; row++)
  {
  for(int col2=1; col2<row; col2++)
   {
    System.out.print(" ");
   }
for(int no1=4; no1>=row;no1--)
     {
    System.out.print(" * ");
       }
 for(int no2=2; no2>=row;no2--)
     { 
    System.out.print(" * ");
    }
 System.out.println();
}

   for(int row=1; row<=4; row++){

  for(int col1=3; col1>=row; col1--)
     {
    System.out.print(" ");
     }
 for(int no1=1; no1<=row;no1++)
     {
    System.out.print(" * ");
       }
 for(int no2=1; no2<row;no2++)
     { 
    System.out.print(" * ");
    }
    System.out.println();
     
  } 
}

public static void main(String arg[]){
  patterns1 vengat=new patterns1();
           vengat.main();
}
}

  
