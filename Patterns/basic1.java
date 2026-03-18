// Simple Star Pattern 
// solving this problem using nested loops without functions
public class basic1{
    public static void main(String[] args) {
        // outer loop(number of lines)
        int n = 4; // toatal no of lines for the pattern
        for(int line=1; line<=n; line++){
            for (int star =1; star<=line; star++) {  // inner loop 
                System.err.print("*");  // what to print 
            }
            System.out.println();
        }
      
       
    }
}