package matrix;

public class Matrix {
	public static void main(String[] args) {
		
		String matrix [][] = new String[4][4];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j ) {
              System.out.print(matrix[i][j] = " * ");
				}
				else {
					System.out.print(k+" ");
					k++;
				}
					
              
			} System.out.println();


		}


	}
}
