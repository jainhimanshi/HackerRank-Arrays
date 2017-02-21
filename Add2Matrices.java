// Java program to add two matrices of the same size
package w3arraysolutions;
public class Add2Matrices {
	public static void main(String[] args) {
		   int matrice1[][]={{1,2},{3,4}};
		   int matrice2[][]={{1,2},{4,7}};
                for (int i=0;i<2;i++)
                {
			   for(int j=0;j<2;j++){
				   int sum=matrice1[i][j]+matrice2[i][j];
				   System.out.print("     "+sum);
			   }
			   System.out.println();
                }
	}
}
