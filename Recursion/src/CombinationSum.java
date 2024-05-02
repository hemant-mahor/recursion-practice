import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {

        combinationSum(new int[]{2,3,6,7},12);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<Integer> temp = new ArrayList<>();
        helper(candidates,target,0,0,temp);
        return ans;
    }

    public static void helper(int[] candidates, int target, int i, int crSum, List<Integer> temp){
        if(crSum > target){
            return;
        }

        if(i == candidates.length){
            if(crSum == target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        crSum += candidates[i];
        temp.add(candidates[i]);
        helper(candidates, target, i, crSum, temp);
        crSum -= candidates[i];
        temp.remove(temp.size()-1);

        helper(candidates, target, i+1, crSum, temp);
    }
}
