 class apseriess1{
   void add()
   {
   int first=1;
   int second=2;
   int sum=2;
   
  {
  for(int i=1;i<=7;i++)
    {
   System.out.println(first);
    first =second;
   second=(sum*sum)+first;
    sum++;
     
   }
  }
 }
} 
class apseriess2 extends  apseriess1{
   void main()
   {
   int first=8;
   int second=29;
   int sum=0;
   
  {
  for(int i=1;i<=7;i++)
    {
   System.out.println(first);
   sum =second-first;
    first =second;
   second=(sum*4)+first;

   }
  }
 }
}

 class apseriess3 extends apseriess2{
    void add(){
       int first=2;
       int sum=2;
        {
         for(int i=1;i<=6;i++)
           {
              System.out.println(first);
              first=first*sum;
               sum++;
            }
        }
    }
}
  public class apseries{
public static void main(String arg[]){
    apseriess3 me=new apseriess3();
     me.add();
   }
}
