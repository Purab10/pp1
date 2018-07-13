import java.util.Scanner;
class Complex {
int r,i;
	Complex(int r,int i)
	{	this.r=r;
		this.i=i;
	}
	void Display()
	{
    System.out.println("The number is:"+r+"+"+i+"i");
	}
public static void main(String args[])
{
	System.out.println("Enter the Real part");
	Scanner in=new Scanner(System.in);
	int x= in.nextInt();
	System.out.println("Enter the Imaginary part");
	int y= in.nextInt();
	Complex c=new Complex(x,y);
	c.Display();
}
}