class pattern{
  void program()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if(i==1&&j>1&&j<5||j==1&&i>1||i==3||j==5&&i>1)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }      
         System.out.println("\n");
         } 
     }

class pattern1 extends pattern{
  void program1()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if(i==1&&j<5||j==1||i==3||i==5&&j<5 || j==5&&i<5&&i>1)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

        }
      System.out.println("\n");
        } 
     }
class pattern2 extends pattern1{
  void program2()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if(i==1||j==1||i==5)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
        System.out.println("\n");
       } 
     }class pattern3 extends pattern2{
  void program3()
{
   for(int i=1; i<=5;i++)
     {
     for(int j=1; j<=5;j++)
     { 
     if  ((i==1&&j<5)||(i==5&&j<5)||(j==5&&i>1&&i<5)||j==2)
        {
        System.out.print("*");
        }
         else
         {
          System.out.print(" ");
          }
         }
      System.out.println();

         }
        System.out.println("\n");
       } 
     }
 class pattern4 extends pattern3{
   void program4()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1 || j==1 || i==3 || i==5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
  System.out.println("\n");
   }

 }
  class pattern5 extends pattern4{
   void program5()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1 || j==1 || i==3 )
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern6 extends pattern5{
   void program6()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j>1||j==1&&i>1||i==3&&j>2||i==5||j==5&&i>2)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
System.out.println("\n");
  }
 }
class pattern7 extends pattern6{
   void program7()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if( j==1 || i==3 || j==5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
   System.out.println("\n");
  }
 }
class pattern8 extends pattern7{
   void program8()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1 || j==3 || i==5 )
       {     
        System.out.print("*");
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
   System.out.println("\n");
  }
 }
class pattern9 extends pattern8{
   void program9()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1 ||  j==3 || i==5&&j<4)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern10 extends pattern9{
   void program10()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(j==1|| i+j==6&&i<4 ||i==j&&i>3)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
   System.out.println("\n");
  }
 }
class pattern11 extends pattern10{
   void program11()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if( j==1 || i==5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern12 extends pattern11{
   void program12()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(j==1 || j==5 || i==j&&i<4||i+j==6&&i<4)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
     System.out.println("\n");
  }
 }
class pattern13 extends pattern12{
   void program13()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(j==1 || i==j||j==5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
     System.out.println("\n");
  }
 }
class pattern14 extends pattern13{
   void program14()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j>1 &&j<5||i==5&&j>1&&j<5||j==1&&i>1&&i<5||j==5&&i>1&&i<5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }

class pattern15 extends pattern14{
   void program15()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j<5||j==1||i==3&&j<5||j==5&&i<4&&i>1)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern16 extends pattern15{
   void program16()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j<5||j==1||i==3&&j<5||j==5&&i<4&&i>1||i==j)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }

class pattern17 extends pattern16{
   void program17()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j>1&&j<4||i==4&&j>1&&j<4||j==1&&i>1&&i<4||j==5&&i>1&&i<4||i==j&&i>3)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern18 extends pattern17{
   void program18()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1&&j>1||i==5&&j<5||j==1&&i>1&&i<4&&i<5&&i<3||j==5&&i>3&&i<5||i==3&&i>1)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern19 extends pattern18{
   void program19()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(j==1&&i<5||i==5&&j>1&&j<5||j==5&&i<5)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }class pattern20 extends pattern19{
   void program20()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==j&&i<4||i+j==6&&i<4)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern21 extends pattern20{
   void program21()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(j==1||j==5||i==j&&i>2||i+j==6&&i>2)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }class pattern22 extends pattern21{
   void program22()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i+j==6||i==j)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }class pattern23 extends pattern22{
   void program23()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i+j==6||i==j&&i<4)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
class pattern24 extends pattern23{
   void program24()
  {
    for(int i=1; i<=5;i++)
   {
     for (int j=1; j<=5;j++)
    {
      if(i==1||i==5||i+j==6)
      {
        System.out.print("*");
   
      }
    else
     {
      System.out.print(" ");
    }
    } 
  System.out.println();
   }
    System.out.println("\n");
  }
 }
   class pattern111{

public static void main (String arg[]){
  pattern24 me=new pattern24();
           me.program();
           me.program1();
           me.program2();
           me.program3();
           me.program4();
           me.program5();
           me.program6();
           me.program7();
           me.program8();
           me.program9();
           me.program10();
           me.program11();
           me.program12();
           me.program13();
           me.program14();
           me.program15();
           me.program16();
           me.program17();
           me.program18();  
           me.program19();
           me.program20();
           me.program21();  
           me.program22();
           me.program23();
           me.program24();
 
 
           


}
}

