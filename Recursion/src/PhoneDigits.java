import java.util.ArrayList;
import java.util.List;

public class PhoneDigits {
    public static List<String> ans = new ArrayList<>();
    public static String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        letterCombinations("");
        System.out.println(ans);
    }
    public static List<String> letterCombinations(String digits) {
        int[] arr = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            arr[i] = digits.charAt(i) - '0';
        }
        helper(arr, "", 0);
        return ans;
    }

    public static void helper(int[] arr, String str, int i){
        if(i == arr.length){
            if(!str.isEmpty())
                ans.add(str);
            return;
        }

        for (int j = 0; j < keys[arr[i]].length(); j++) {
            helper(arr,str+keys[arr[i]].charAt(j),i+1);
        }
    }
}
