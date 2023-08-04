import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    count++;
                    break;
                }
            }
            if(count == 1){
                sum += nums[i];
            }
        }
        return sum;
    }
}