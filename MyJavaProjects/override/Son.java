class Father
{
   public void displayInfo()
   {
      System.out.println("I used to play club football");
   }
}

class Son extends Father 
{
   public void displayInfo()
   {
      System.out.println("I play football quite well");
   }
}

class Main {
   public static void main(String[] args) {
      Son d1 = new Son();
      d1.displayInfo();
   }
}
