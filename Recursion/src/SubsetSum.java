public class SubsetSum {
    public static void main(String[] args) {

        System.out.println(isExist(new int[]{3,34,4,12,5,2},23));
    }

    public static boolean isExist(int[] arr, int sum){
        return helper(arr, sum, 0, 0);
    }

    private static boolean helper(int[] arr, int sum, int tempSum, int i) {
        if(sum == tempSum){
            return true;
        }

        if(i>= arr.length){
            return false;
        }

        boolean take =  helper(arr, sum, tempSum + arr[i], i+1);
        boolean notTake = helper(arr, sum, tempSum,i+1);

        return take || notTake;
    }
}
