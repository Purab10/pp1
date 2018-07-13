import java.util.Scanner;
public class SecondLargest {
     public static void main(String[] args) {
    int z;       
 int arr[]= new int[10];
	System.out.println("Enter the elements of array");
	Scanner sn=new Scanner(System.in);
	for(z=0;z<10;z++)
	{
		
		arr[z]= sn.nextInt();
		
	}

int largest = arr[0];
int secondLargest = arr[0];
System.out.println("The given array is:" );
for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {
                                                 if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];
}         
                                  else if (arr[i] > secondLargest) {
			secondLargest = arr[i];
}
}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}
}