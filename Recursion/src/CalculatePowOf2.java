public class CalculatePowOf2 {
    public static void main(String[] args) {
        System.out.println(pow(4));
    }

    public static int pow(int n){
        if(n == 1){
            return 2;
        }
        int recCall = pow(n-1);
        return recCall*2;
    }
}
