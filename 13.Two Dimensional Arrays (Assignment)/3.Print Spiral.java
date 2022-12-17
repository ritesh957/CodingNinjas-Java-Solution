public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
				if (matrix.length!=0) {
            int x = matrix[0].length;
            int y = matrix.length;
            int count = 0;
            for (int i = 0; i < x / 2+1; i++) {
                for (int j = i; j < x - i && count < x*y; j++) {
                    System.out.print(matrix[i][j] + " ");
                    count++;
                }

                for (int j = i + 1; j < y - i && count < x*y; j++) {
                    System.out.print(matrix[j][x - 1 - i] + " ");
                    count++;
                }
;
                for (int j = x - 2 - i; j >=i  && count < x*y; j--) {
                    System.out.print(matrix[y - 1 - i][j] + " ");
                    count++;
                }

                for (int j = y - 2 - i; j >= i + 1 && count < x*y; j--) {
                    System.out.print(matrix[j][i] + " ");
                    count++;
                }

            }
        }
	}
}
