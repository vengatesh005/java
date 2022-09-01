interface  school
  {
   void studying();
  }
 
 class exam implements school{
  public void  studying()
  {
     System.out.println(" pass in the semester exam ");
   }

  }
 class schoolstudy{
   public static void main(String arg[]){
     exam pen=new exam();
          pen.studying();
  }
 }
