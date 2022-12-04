import java.util.Scanner;

public class probelm21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int  n = scn.nextInt();

        int[] arr = new int[n];
        int [] [] b = new int[2][2];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scn.nextInt();
        }

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                b[i][j]= scn.nextInt();
            }
        }

            long[] ans = rangeSum(arr,b);

        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }


    }

    public static long [] rangeSum(int [] A,int [][] B){

        long [] sum_range = new long [B.length];


        for(int i=0;i<B.length;i++){
            int L = B[i][0];
            int R = B[i][1];
            long val =  0;
            for(int j=L-1;j<R;j++){
                val += A[j];
            }
            sum_range[i] = val;
        }

        return sum_range;

    }
}
