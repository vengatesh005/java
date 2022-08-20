public class job{
 
 String name;
 char gender;
  int age;
  long phone;
void info()
  {
System.out.println("Name:"+ name+"\n"+"Gender:"+gender+"\n"+"Age:"+age+"\n"+"Phone:"+phone+"\n");
  }
 public static void main(String arg[]){
  job application1=new job();
      application1.name="vengat";
      application1.gender='m';
      application1.age=20;
      application1.phone=9789654389l;
    
      job application2=new job();
      application2.name="vimal";
      application2.gender='m';
      application2.age=20;
      application2.phone=9789654389l;
      
      job application3=new job();
      application3.name="suraya";
      application3.gender='m';
      application3.age=20;
      application3.phone=9789654389l;
      
      application1.info();
      application2.info();
      application3.info();

     

    }
  }

