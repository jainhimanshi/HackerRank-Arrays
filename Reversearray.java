//Java program to reverse an array of integer values.
package w3arraysolutions;
public class Reversearray {
	public static void main(String[] args) {
		int array[]={1,2,3,4,5};
		int temp=0;
		int j=array.length-1;
		int i=0;
		while(i<j){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
		}
		for(int k=0;k<array.length;k++){
              System.out.print(array[k]+"  ");
	}

}
}