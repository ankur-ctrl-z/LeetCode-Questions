package Array;

// public class Rotate_Array {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//         int k = 3;
//         Rotate(arr, k);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }

//     public static void Rotate(int[] arr, int k) {
//         int n = arr.length;
//         k = k % n;
//         Reverse(arr, 0, n - 1 - k);
//         Reverse(arr, k + 1, n - 1);
//         Reverse(arr, 0, n - 1);

//     }

//     public static void Reverse(int[] arr, int i, int j) {
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }
// }

class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        for (int i = 1; i <= k; i++) {
            int lastItem = arr[n - 1];

            for (int j = n - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = lastItem;
        }
    }
}
