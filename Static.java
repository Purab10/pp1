class Static
{
    static int a = 10;
    static int b;
    
    int c = 30;
     
        static void yello(){
        System.out.println("Static block initialized.");
        b = a * 4;
    }
 
    public static void main(String[] args)
    {
       System.out.println("from main");
       yello();
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
       
       Static i= new Static();
       System.out.println("Value of b : "+i.c);
    }
}