public class febno1{
  void add(){
  int first=0;
  int second=1;
  int sum=0;
   int n=8;
 for(int i=1;i<=n;i++)
   {
 
  sum=first+second;
  first=second;
   second=sum;
   System.out.println(sum);
  }
}
  public static void main(String arg[]){
   febno1 sy=new febno1();
         sy.add();
  }
} 
