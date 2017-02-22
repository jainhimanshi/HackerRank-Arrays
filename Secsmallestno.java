//Java program to find the second smallest element in an array.
package w3arraysolutions;

public class Secsmallestno {
	public static void main(String[] args) {
		int array[]={2,3,4,1};
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j]){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}

	}
System.out.println(array[1]);
}
}