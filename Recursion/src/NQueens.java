import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NQueens {
    public static List<List<String>> ans;

    public static void main(String[] args){
        ans = new ArrayList<>();
        solveNQueens(4);
        System.out.println(ans);
    }
    public static void helper(List<List<String>> board, int n, int r){
        if(r == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (Objects.equals(board.get(i).get(j), "Q")) {
                        row.append("Q");
                    } else {
                        row.append(".");
                    }
                }
                temp.add(row.toString());
            }
            ans.add(temp);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(isSafe(board,r,i,n)){
                board.get(r).set(i,"Q");
                helper(board,n,r+1);
                board.get(r).set(i,"");
            }
        }
    }

    private static boolean isSafe(List<List<String>> board, int r, int c, int n) {
        for (int i = 0; i < n; i++) {
            if(Objects.equals(board.get(i).get(c), "Q")){
                return false;
            }
        }

        for (int i = r-1, j = c-1; i >= 0 && j >= 0; i--,j--) {
            if(Objects.equals(board.get(i).get(j), "Q")){
                return false;
            }
        }

        for (int i = r-1, j = c+1; i >= 0 && j < n; i--,j++) {
            if(Objects.equals(board.get(i).get(j), "Q")){
                return false;
            }
        }

        return true;
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add("");
            }
            board.add(row);
        }
        helper(board,n,0);
        return ans;
    }
}
