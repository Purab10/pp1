class Animal{
	String breed,color;
	void speak()
	{
		System.out.println("speka function of animals");
	}
}
class Dog extends Animal
{
 Dog(String a,String b)
 {
	 this.breed=a;
	 this.color=b;
 }
 void speak()
 {
	 System.out.println("Speak Function Of Dog class");
	 System.out.println("My Name is: "+breed);
           System.out.println(" color is: "+color);
                       
 }
}
class cat extends Animal
{
 cat(String a,String b)
 {
	 this.breed=a;
	 this.color=b;
 }
 void speak()
 {
	 System.out.println("Speak Function Of Cat class");
	 System.out.println("My Name is: "+breed);
                  System.out.println("color  is: "+color);
                 
 }
}
public class Override {

	public static void main(String args[])
	{
	Dog d=new Dog("German shepherd","black");
		d.speak();
		cat c=new cat("Kitt","white");
		c.speak();
}
}