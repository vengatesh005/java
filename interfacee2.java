interface  Human
  {
  void maximum(int height,int wait);
  }
  class man implements Human{
    public void maximum(int height,int weight)
    {
        System.out.println("human"+height +"\n"+"Human"+ weight);   
    }
  }
      
 
  class interfacee2{
   public static void main(String arg[]){
       man obj=new man();
           obj.maximum(6,60);
    }
  }
