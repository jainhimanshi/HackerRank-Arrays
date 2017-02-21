//Java program to test if an array contains a specific value.
package w3arraysolution;
import java.util.Scanner;
public class Specificvalue {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]={1,2,3,4,5};
		for(int i=0;i<array.length;i++){
			if(array[i]==n)
				System.out.println("it matches");
		}
	}

}
