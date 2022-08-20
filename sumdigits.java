public class sumdigits{
  void add()
  { 
  int sum=0;
  int n=4322;

while(n>0||sum>9)
  {
   if(n==0)
     {
       n=sum;
       sum=0;
     }
    sum=sum+n%10;
    n=n/10;
  } 
{
   System.out.println(sum);

} 
}

public static void main(String arg []){
    sumdigits vengat=new sumdigits();
              vengat.add();
}
}

 
