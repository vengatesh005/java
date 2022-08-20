public class prime{
   void check()
{ 
  int count=0;
  int i=1;
  int n=12;
    while(i<=n)
  {
   if(n%i==0)
 {
    System.out.println("is a factorial"+i);
    count++; 
 }

 
  i++;
}
   

 if(count==2)

    {
     System.out.println("prime nubmber");
   }
 else
   {
  System.out.println("not prime nubmber");   
}
}
 public static void main(String arg[]){
    prime vvs=new prime();
          vvs.check();
}
}
