public class primnumber{
  void add()
{
  int count=0;
  int n=100;
  for(int i=1;i<=n;i++)
{ 
 if(n%i==0)
{
 System.out.println(i);
 count++;
}
 }
  
if(count>2)
{

System.out.println("not prime number");

}
 }
public static void main(String arg[]){
 primnumber vengat=new primnumber();
            vengat.add();
}
 }
