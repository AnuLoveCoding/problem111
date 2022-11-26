import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn .nextInt();
        int [][] arr = new int[n][n];

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j]=scn.nextInt();
            }
        }

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }

                if(i+j==n-1){
                    sum+=arr[i][j];
                }

            }

            if(n%2==1){
                sum-=arr[n/2][n/2];
            }
        }

        sum-=arr[0][0];
        sum-=arr[0][n-1];
        sum-=arr[n-1][0];
        sum-=arr[n-1][n-1];

        System.out.println(sum);


    }
}
