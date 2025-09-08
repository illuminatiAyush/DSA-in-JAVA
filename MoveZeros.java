
/* q1 . You’re given an array of integers. Write a function to move all zeros to the end while keeping the relative order of non-zero elements the same. */

You cannot use another array.

Optimize for time and space.

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//  used two pointer opt approach 