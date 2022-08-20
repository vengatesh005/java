public class patterns{
     void main()
          {
               
               for(int row=1;row<=3;row++)
                  {
                  
               for(int col=3;col>=row;col--)
                   {
                     System.out.print("*");
                    }
               
                     
                    System.out.println();
                    }
   }
public static void main(String arg[]){
         patterns obj=new patterns();
         obj.main();
    }
}
