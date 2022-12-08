public class problem44 {
//    public int[] solve(int[] A) {
//        int [] arr = new int [A.length];
//
//        int product = 1;
//
//
//        for(int i=0;i<A.length;i++){
//            product*=A[i];
//        }
//
//        for(int i=0;i<arr.length;i++){
//            int divide = product;
//            divide/=A[i];
//            arr[i]=divide;
//        }
//
//        return arr;
//    }
    public static void main(String[]args){

    }
    public int[] solve(int[] A) {
        int [] prefix_sum = new int[A.length];

        prefix_sum[0] = A[0];

        for(int i=1;i<A.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+A[i];
        }

        return prefix_sum;
    }
}
