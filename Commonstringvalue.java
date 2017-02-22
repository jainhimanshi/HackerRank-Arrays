//Java program to find the common elements between two arrays (string values).
package w3arraysolutions;
public class Commonstringvalue {
	public static void main(String[] args) {
		String array1[]={"ab","cd","ef"};
		String array2[]={"ab","gh","ij"};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++){
				if(array1[i]==array2[j]){
					System.out.println("common string element is "+array1[i]);
				}
			}
		}
	
	}

}
