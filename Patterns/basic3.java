//  Half Pyramid Pattern Using numbers 
// solving this problem using nested loops without functions
public class basic3{
    public static void main(String[] args) {
        // outer loop(number of lines)
        int n = 4; // total number of lines for the pattern 
        for(int line=1; line<=n; line++){
            for (int number =1; number<=line; number++) {  // inner loop print numbers 
                System.err.print(number);  // what to print 
            }
            System.out.println();
        }
      
       
    }
}