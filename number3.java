public class number3{
  void add()
   {

    int row=1;
     while(row<=4)
     {
     int col=1;
      while(col<=4)
      {
      System.out.print(col/4);
      col++;
      }
     System.out.println();
     row++;
      }
  }
 public static void main(String arg[]){
   number3 vsp=new number3();
        vsp.add();
 
      }
  
  }
