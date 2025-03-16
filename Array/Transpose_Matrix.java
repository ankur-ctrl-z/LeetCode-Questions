package Array;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = { { 2, 1, 3, 4 }, { 5, 6, 8, 7 }, { 12, 56, 78, 9 }, { 89, 76, 42, 34 } };
        Tranpose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] Tranpose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        int result[][] = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
}
