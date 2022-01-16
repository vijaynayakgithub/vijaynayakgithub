package Assignments.com;

public class WorkingWithSingleDiamentionalAndMultiDiamentionalArray {

	public static void main(String[] args) {

		
		int[] single = {1,2,3,4,5,6,7,8,9};
		System.out.println("The elements in single diamentional array is ");
		for (int i=0;i<9;i++)
			System.out.print(single[i]+ " ");
		int[][] multi = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		System.out.println("The elements in multi diamentional array is ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multi[i][j]+ " ");
			}
			System.out.println();
		}
	}

}