import java.util.*;
public class Factor {
	public static void main (String args[]){
    		int i, n;
  		System.out.println("Print all even 					numbers till: ");
    		Scanner in=new Scanner(System.in);
		n= in.nextInt();
        		System.out.println("Even numbers from 1 			to "  +n + " are: \n");
    		for(i=1; i<=n; i++){
        			if(i%2 == 0)
     				System.out.println					("no. " +i);
    		}
	}
}