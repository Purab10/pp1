import java.util.Scanner;
public class Rectangle {
int l, b;
Rectangle(int l,int b)
{
	this.l=l;
	this.b=b;
	}
void CalcArea()
	{
	System.out.println("Area of rect="+l*b);
	}
public static void main(String args[])
{
	System.out.println("Enter the Length of rectangle");
	Scanner in=new Scanner(System.in);
	int p= in.nextInt();
	System.out.println("Enter the Breadth of rectangle");
	int q= in.nextInt();
	Rectangle rect=new Rectangle(p,q);
	rect.CalcArea();
}
}