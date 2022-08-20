public class patterns2{
  void main()
{
  for(int row=1;row<=3;row++)

  {
     for(int col=0;col<=row;col++)
     {
       System.out.print("");
     }

   for(int col1=3;col1>=row;col1--)
{
  System.out.print("*");
}
  }
  System.out.println();
}

public static void main(String args[]){

    patterns2 me=new patterns2();
    
    me.main();

}



}
