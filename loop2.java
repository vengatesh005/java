public class loop2{
 void add()
{
   int count=0;
  int i=1;
  while(i<=97)
{
   if(97%i==0)
{
 System.out.println(i+" factorial");
 count ++;
}
   else
{
//System.out.println(i+"  is non primary"); 
}
 i++;

}
}

 public static void main(String arg[]){
     loop2 vengat=new loop2();
           vengat.add();
}
}
