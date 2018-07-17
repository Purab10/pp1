import java.util.Scanner;
class Maximum1 {
Scanner xy=new Scanner(System.in);
String s1=xy.next();
String s2=xy.next();
void calculate() {
if(Integer.parseInt(s1)>Integer.parseInt(s2)) {
System.out.println("s1 is maximum");
}else {
System.out.println("s2 is maximum");
 }
}
public static void main(String args[]) {
Maximum1 m=new Maximum1();	
m.calculate();
}
}