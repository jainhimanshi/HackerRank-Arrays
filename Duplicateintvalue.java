//Write a Java program to find the duplicate values of an array of integer values
package w3arraysolutions;
public class Duplicateintvalue {

	public static void main(String[] args) {
		int array[]={1,2,3,2,4};
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
			if(array[i]==array[j]){
				System.out.print(array[i]);
			}
				
		}

	}
	}
}

