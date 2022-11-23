import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
//        (Q.1) You are given a N X N square integer matrix A.
//        You have to tell whether A is an identity matrix or not.
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j]=scn.nextInt();
            }
        }
        int ans = 0;
        if(arr.length!= arr[0].length){
            ans =0;
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(i==j && arr[i][j]!=1){
                    ans=0;
                }
                if(i!=j && arr[i][j]!=0){
                    ans =0;
                }
            }

        }
        ans =1;

    }
}
