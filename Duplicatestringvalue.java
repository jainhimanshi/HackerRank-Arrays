//Write a Java program to find the duplicate values of an array of integer values
package w3arraysolutions;

public class Duplicatestringvalue {
	public static void main(String[] args) {
		String array[]={"ab","cd","ab","ef"};
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
			if(array[i]==array[j]){
				System.out.print(array[i]);
			}
				
		}

	}
	}
}

