public class Subsets {
    public static void main(String[] args) {
        sub(new int[]{1, 2, 3});
    }

    public static void sub(int[] arr){
        helper(arr,new int[arr.length],0,0);
    }

    private static void helper(int[] arr, int[] subset, int i, int subsize) {
        if(arr.length == i){
            System.out.print("[ ");
            for (int j = 0; j < subsize; j++) {
                System.out.print(subset[j] + " ");
            }
            System.out.println("]");
            return;
        }

        // to take
        subset[subsize] = arr[i];
        helper(arr,subset,i+1,subsize+1);

        // to not tak
        helper(arr,subset,i+1,subsize);
    }
}
