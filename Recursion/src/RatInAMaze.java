import java.util.ArrayList;

public class RatInAMaze {
    public static ArrayList<String> ans;

    public static void main(String[] args){
        int[][] m = {{1, 1, 1, 0},
                     {0, 1, 1, 0},
                     {1, 0, 1, 1},
                     {1, 0, 1, 1}};
        findPath(m,4);
        System.out.println(ans);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ans = new ArrayList<>();
        int[][] visited = new int[n][n];
        helper(m,visited, n,0,0,"");
        return ans;
    }

    private static void helper(int[][] m, int[][] visited, int n, int srcx, int srcy, String temp) {
        if(srcx == n-1 && srcy == n-1){
            ans.add(temp);
            return;
        }

        visited[srcx][srcy] = 1;
        if(isSafe(m,visited,n,srcx+1,srcy)){
            helper(m,visited,n,srcx+1,srcy,temp+"D");
        }
        if(isSafe(m,visited,n,srcx,srcy-1)){
            helper(m,visited,n,srcx,srcy-1,temp+"L");
        }
        if(isSafe(m,visited,n,srcx,srcy+1)){
            helper(m,visited,n,srcx,srcy+1,temp+"R");
        }
        if(isSafe(m,visited,n,srcx-1,srcy)){
            helper(m,visited,n,srcx-1,srcy,temp+"U");
        }

        visited[srcx][srcy] = 0;

    }

    private static boolean isSafe(int[][] m, int[][] visited, int n, int srcx, int srcy) {
        if(srcx >= 0 && srcy >= 0 && srcx < n && srcy < n && m[srcx][srcy] == 1 && visited[srcx][srcy] == 0){
            return true;
        }
        return false;
    }


}
