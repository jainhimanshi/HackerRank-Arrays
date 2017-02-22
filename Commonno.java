//Java program to find the common elements between two arrays of integers
package w3arraysolutions;
public class Commonno {
	public static void main(String[] args) {
		int array1[]={1,2,3};
		int array2[]={1,5,6};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++){
				if(array1[i]==array2[j]){
					System.out.println("common element is "+array1[i]);
				}
			}
		}
		

	}

}
