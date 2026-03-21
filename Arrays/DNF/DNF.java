// hum DNF algpo tbhi use krte h jab hume array me basically 3 sections diye ho nd unhe sort krna ho accordingly..
// so iss Qn me whi concept use hua h jisme humara mid main role play krta h, nd low nd high array ke starting nd ending part ko dekhte/sort krte h
// DNF ki time complexity is O(n) kyuki hum ek hi pass me pure array ko traverse krte hai (single pass over n elements) & space comp is O(1) since there is no extra space used except variables, jo array size se independent hai

package Arrays.DNF;

public class DNF {
    public static void dnf(int nums[]) {

        int mid=0; 
        int low = 0; 
        int high = nums.length-1; 
        int temp;

        while(mid<=high){
        if(nums[mid] == 0){
            temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
        low++;
        mid++;
        }

        else if(nums[mid] == 1){
            mid++;
        }
        else{
            temp = nums[mid];
            nums[mid] =  nums[high];
            nums[high] = temp;
            high--;
            
        }

    }
    return;}
    public static void main(String[] args) {
        int nums[] = {0, 2, 0, 1, 1, 2};
        dnf(nums);
        
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
            }
            

        return; 
    }
}

