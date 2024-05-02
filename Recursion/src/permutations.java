import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;


public class permutations {
    // with swapping approach
    public static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        permute(new int[]{1,2,3});
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        helper(arr,0);
        return ans;
    }

    public static void helper(List<Integer> nums, int i){
        if(i==nums.size()){
            ans.add(new ArrayList<>(nums));
            return;
        }

        for (int j = i; j < nums.size(); j++) {
            swap(nums,i, j);
            helper(nums,i+1);
            //backtrack
            swap(nums,i, j);

        }
    }
}
