//Write a Java program to convert an ArrayList to an array.
package w3arraysolutions;
import java.util.*;
public class ArraylistTOArray {
		public static void main(String[] args) {

			/*ArrayList declaration and initialization*/
			ArrayList<String> friendsnames= new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harsh");
			friendsnames.add("John");

			/*ArrayList to Array Conversion */
			String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

			/*Displaying Array elements*/
			for(String k:frnames)
			{
				System.out.println(k);
			}
		}
	}
