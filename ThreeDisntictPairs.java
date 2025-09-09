/* You’re given an array of integers. Write a program to find 3 distinct pairs (a, b) such that no element is reused across pairs.

For example:
Input: [1, 2, 3, 4, 5, 6, 7]
Output: (1,2), (3,4), (5,6) 
*/

public class ThreeDistinctPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int pairCount = 0;

        if (n < 6) {
            System.out.println("Not enough elements to form 3 distinct pairs!");
            return;
        }

        System.out.println("3 distinct pairs:");

        
        for (int i = 0; i < n - 1 && pairCount < 3; i += 2) {
            System.out.println("(" + arr[i] + ", " + arr[i + 1] + ")");
            pairCount++;
        }
    }
}
