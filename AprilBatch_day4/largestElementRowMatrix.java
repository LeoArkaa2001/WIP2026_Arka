package AprilBatch_day4;

public class largestElementRowMatrix {
	public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 1},
            {9, 2, 7},
            {4, 8, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            System.out.println("Row " + i + " max: " + max);
        }
    }

}
