// Code to print inverted  rotated Pyramid
/*         
           *
         * *
       * * *
     * * * *
     
*/
public class INRP {
    
    public static void inverted_rotated_Pyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
        // spaces
        for(int j=1; j<=n-i; j++){
        System.out.print(" ");        
        }
        //stars 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
public static void main (String[] args) {
    /* code */
    inverted_rotated_Pyramid(5);
} 
    }