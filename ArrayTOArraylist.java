//Java program to convert an array to ArrayList.
package w3arraysolutions;
import java.util.*;
public class ArrayTOArraylist {
	public static void main(String[] args) {
	//declare an array
		String array[]={"ab","cd","ef"};
	//convert array into arraylist
		ArrayList<String>names=new ArrayList<String>();
	names.add("ab");
	names.add("cd");
	names.add("ef");
	for(String k:names)
     System.out.println(k);

	}

}
