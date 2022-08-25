 Class Apseriess1{
   Void Add()
   {
   Int First=1;
   Int Second=2;
   Int Sum=2;
   
  {
  For(Int I=1;I<=7;I++)
    {
   System.Out.Println(First);
    First =Second;
   Second=(Sum*Sum)+First;
    Sum++;
     
   }
  }
 }
} 
Class Apseriess2 Extends  Apseriess1{
   Void Main()
   {
   Int First=8;
   Int Second=29;
   Int Sum=0;
   
  {
  For(Int I=1;I<=7;I++)
    {
   System.Out.Println(First);
   Sum =Second-First;
    First =Second;
   Second=(Sum*4)+First;
  
   }
  }
 }
}

 Class Apseriess3 Extends Apseriess2{
    Void Sum(){
       Int First=2;
       Int Sum=2;
        {
         For(Int I=1;I<=6;I++)
           {
              System.Out.Println(First);
              First=First*Sum;
               Sum++;
            }
        }
    }
}
  Public Class Apseries111{
Public Static Void Main(String Arg[]){
    Apseriess3 Me=New Apseriess3();
              Me.Add();
              Me.Main();
              Me.Sum();
   }
}
