public class sampleforpri{
   void add()

  {
     int count=0;
     int n=100;
   for(int i=1;i<=n; i++)
   {
   if(n%i==0)
   {
    count++;
    }
 }  
}
   if(count==2)
  {

System.out.print("prime number");
  }
else
  {
System.out.print("not prime number");

   }
 
  public static void main(String arg[]){
 sampleforpri vengat=new sampleforpri();
            vengat.add();
}
  }
