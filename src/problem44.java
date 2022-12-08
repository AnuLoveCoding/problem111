public class problem44 {
    public int[] solve(int[] A) {
        int [] arr = new int [A.length];

        int product = 1;


        for(int i=0;i<A.length;i++){
            product*=A[i];
        }

        for(int i=0;i<arr.length;i++){
            int divide = product;
            divide/=A[i];
            arr[i]=divide;
        }

        return arr;
    }
    public static void main(String[]args){

    }
}
