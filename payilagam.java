public class payilagam{
    void add()
          {
            int row=1;
            for(row=1;row<=5;row++)
               {
                 for(int col=1;col<=4;col++)
                  {
                     if(row==2|| col==2)
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
public static void main(String arg[]){
         new payilagam().add();
        }
 }
