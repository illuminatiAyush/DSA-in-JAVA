// ok toh is code me kuch kuch conditions h, pehle toh order same hona chahiye, fir alternate +- pair me hone chahiye, nd final arr + signed int se shuru hona chahiye

//toh iske liye hum sbse phele positive elements & negative elements ko separate krenge, ek for loop chala kar
//fir ek aur loop chala kr unhe ek new array me store krdenge


public class code{
    public static int[] codz(int nums[]) {
        int p = 0; int n = 0;
        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length  / 2];
        for(int i =0; i<nums.length; i++){
            if(nums[i] > 0){
                pos[p++] = nums[i];
            }
            else {
                neg[n++] = nums[i];
            }
        }
        p = 0; n = 0;
    int arr[] = new int[nums.length];
    for(int i = 0; i < nums.length ; i++){
        if(i % 2 == 0){
            arr[i] = pos[p++];
        }
        else{
             arr[i] = neg[n++]; 
        }
    }
    return arr;}
    
    public static void main(String[] args) {
        int nums[] = {-1, 2, 3, -6, -4, +9};
        int[] result = codz(nums);
        for(int i = 0; i < result.length ; i++){
        System.out.print(result[i] + " ");}
        return;
    }
}

//since humne traverse kiya poora array, fir separate kiya +- integers, so O(n) hua.. time.
// 3 arrays bane, pos[]. neg[], arr[], so n+n+n=3n gives sspace comp of O(n) only