// ok this is typical subarray wla problem, isme basically humne 2 ptrs use kiye h for tracking the val, if sum == k hua count increment hoga
// time comp O(n^2) & O(1) space
//iska optimised approach bhi h thro' arraylist/hashmaps shyd, but uska implementation apne ko nhi aata guys sorry.. seekhunga jldi

package Arrays.Subarray_Sum_equals_k;

public class subarray {
    public static int subarr(int [] nums, int k) {
        int count = 0; int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
    return count;}
    public static void main(String[] args) {
        int [] nums = {1, 1, 1 , 1};
        int k = 5;
        int result = subarr(nums, k);
        System.out.println(result);
    }
}
