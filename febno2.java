public class febno2{
  void add(){
  int first=1;
  int second=2;
   int n=8;
 for(int i=1;i<=n;i++)
   {
 
  second=first+second;
  first=second-first;
     System.out.println(first);
  }
}
  public static void main(String arg[]){
   febno2 sy=new febno2();
         sy.add();
  }
} 
