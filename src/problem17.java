import java.util.Scanner;

public class problem17 {

    public static int [] solve(int [] arr , int b){
        int [] arr1 = new int [arr.length];

        for (int i = 0; i <arr.length ; i++) {
            arr[(i+b)%arr.length]=arr[i];
        }

        return arr1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        int b = scn.nextInt();

        int [] ans = solve(arr,b);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
