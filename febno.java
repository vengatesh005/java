public class febno{
  void add()
{
  int sum=0;
  int first=0;
  int second=1;
  {
   for(int i=1;i<=5;i++)
  {
   sum=first+second;
   first=second;
   second=sum;
  
   System.out.println(sum);
   }

  } 
}
 public static void main(String arg[]){
   febno v=new febno();
         v.add(); 
 }
}
  

