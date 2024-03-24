public class StringPalindrome {
    public static void main(String[] args) {

        String str = "MADAM";
        System.out.println(isPal(str));
    }

    public static boolean isPal(String S){
        int n = S.length()-1;
        return helper(S,0,n);
    }

    private static boolean helper(String s, int start, int end) {
        if(start >= end){
            return true;
        }

        if(s.charAt(start) != s.charAt(end)){
            return false;
        }

        return helper(s,start+1,end-1);
    }
}
