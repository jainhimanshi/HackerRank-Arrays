//Java program to sort a numeric array and a string array
package w3arraysolution;
public class Sorting {
	public static void main(String[] args) {
		int temp=0;
		int array[]={6,4,2,5};
		//arrange it in increasing order
		for(int n=0;n<=array.length-1;n++)
		{
			if(array[n]>array[n+1])
			{
				array[n]= temp;
				array[n+1]=array[n];
				temp=array[n+1];
			}
		}
		for(int n=0;n<=array.length-1;n++){
			System.out.println(array[n]);
		}
		
	}

}