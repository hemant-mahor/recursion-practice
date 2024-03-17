public class calculatePowOf2 {
    public static void main(String[] args) {
        System.out.println(pow(4));
    }

    public static int pow(int n){
        if(n == 1){
            return 2;
        }

        int call = pow(n-1);
        return call * 2;
    }
}
