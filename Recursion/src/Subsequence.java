public class Subsequence {
    public static void main(String[] args) {
        sub("hemant");
    }

    public static void sub(String str){
        helper(str,"",0);
        return;
    }

    private static void helper(String str, String subStr, int i) {
        if(str.length() == i){
            System.out.print(subStr+ " ");
            return;
        }

        //to take
        helper(str, subStr + str.charAt(i),i+1);
        // to not take
        helper(str,subStr,i+1);
    }
}
