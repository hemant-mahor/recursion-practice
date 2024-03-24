import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(  Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr){
        int n = arr.length-1;
        return helper(arr,0,n);
    }

    private static int[] helper(int[] arr, int s, int e) {
        if(s >= e){
            return arr;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        return helper(arr,s+1,e-1);
    }
}
