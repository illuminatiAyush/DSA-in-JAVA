package Arrays.Remove_Dup_II;

public class code {
    public static int RemoveDup(int[] nums){

        int k = 2; 
        
        if(nums.length <= 2) return nums.length; 

        for(int i = 2; i < nums.length; i++){

            if(nums[i] != nums[k-2]){
                nums[k] =nums[i];
                k++;
            }
        }
    return k;}
    public static void main(String[] args) {
        int nums[] = {1, 1, 1 ,2, 2 , 3};
        
        int result = RemoveDup(nums);
        System.out.print(result);
    }
}
