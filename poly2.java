 class program{
     void add(){
        int n=100;
        int i=1;
        for(i=1;i<=n;i++)
          {
            if(i%2==0)
            { 
            System.out.println(" "+i);
            }
     }
  }
}
     class program1 extends program{
        void add()
       {
        int n=56;
        int count=0;
        int i=1;
    while(i<=n)
    {
      if(n%i==0)
     {  
    System.out.println(" factorial "+i);
    count++;
      }
   i++;
  }

    if(count==2)
     {
    System.out.println(" primenumber");
    }
   else
   {

   System.out.println( "not primenumber"); 
    }
  }

}


 public class  poly2 {
public static void main(String arg[]){
       program1 me=new program1();
       me.add();
   
       }
     }
    
  
