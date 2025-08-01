//  Pattern Using Characters
// solving this problem using nested loops without functions
public class basic4{
    public static void main(String[] args) {
        // outer loop(number of lines)
        int n = 4; // total number of lines for the pattern 
        char ch = 'A'; // used for printing characters
        for(int line=1; line<=n; line++){
            for (int chars =1; chars<=line; chars++) {  // inner loop print characters
                System.err.print(ch);  // what to print
                ch++; // increment characters 
            }
            System.out.println();
        }
      
       
    }
}