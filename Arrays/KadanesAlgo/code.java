public class code{
    public static int code(int nums[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }
        }return max;
    }
    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, 3, 2, 6, -3, 7};
        int result = code(nums);
        System.out.println(result);
    }
}