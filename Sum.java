//Java program to sum values of an array.
package w3arraysolution;

public class Sum {
	public static void main(String[] args) {
		int sum=0;
		int array[]={1,2,3,4,5};
		for(int n=0;n<array.length;n++){
			sum=array[n]+sum;
		}
		System.out.println(sum);
	}
}
