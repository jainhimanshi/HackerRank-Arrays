//Java program to find all pairs of elements in an array whose sum is equal to a specified number=n.v                                                 b
package w3arraysolutions;

public class Specificsum {
	public static void main(String[] args) {
		int array[]={1,2,3,4,5};
		int sum=8;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]+array[j]==sum)
					System.out.println(array[i]+","+array[j]);
			}
		}
	

	}

}
