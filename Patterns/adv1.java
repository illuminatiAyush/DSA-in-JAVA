// Java Program to Print Hollow Rectangle Pattern
public class adv1 {
    public static void hollowRect(int n, int m) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < m; j++) {
                // boundary conditions
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRect(4, 5);
    }
}
