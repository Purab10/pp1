class Overload {
int x;
double y;
void print(int x)
{
	this.x=x;
	System.out.println("this is Int:"+x);
}
void print(double y)
{
	this.y=y;
	System.out.println("this is Float"+y);
}
void print()
{
System.out.println("this is No Arguments...");
}

public static void main(String args[])
{
	Overload z=new Overload();
	z.print(9);
                z.print(6.0);
                z.print();
}
}