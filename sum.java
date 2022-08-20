public class sum
{
  void main()
{
 long sum=0;
  long num=99999999999l;
  while(num>0)
{
sum=sum+num%10;
   num=num/10;
} 
  
 if(sum<100 && sum>9)
{
  sum= sum/10+sum%10;
 System.out.println(sum);

}
else
{
 System.out.println(sum);
}
}
  

public static void main(String arg[]){
   sum vengat=new sum();
       vengat.main();
}
 }

