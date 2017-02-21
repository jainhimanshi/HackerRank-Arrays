//Write a Java program to calculate the average value of array elements.
package w3arraysolution;
public class Averagevalue {
	public static void main(String[] args) {
		int sum=0;
		double aver;
		int ave[]= {1,2,3,4,5};
		for(int n=0;n<ave.length;n++)
		{
			sum=sum+ave[n];
			}
		aver=sum/ave.length;
		System.out.println(aver);

	}

}
