class ReverseString
{
   public static void main(String[] args)
    {
      String input = "Purab Parashar";
      String reverse = new StringBuffer(input).reverse().toString();
      System.out.println("before : "+input);
      System.out.println("after : "+reverse);
   }
}