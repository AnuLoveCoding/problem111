import java.util.Scanner;

public class problem17 {

    public static int [] solve(int [] arr , int b){
        int [] arr1 = new int [arr.length];

        for (int i = 0; i <arr.length ; i++) {
            arr1[(i+b)%arr.length]=arr[i];
        }

        return arr1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your arr size");
        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter Your indexing value");
        int b = scn.nextInt();

        int [] ans = solve(arr,b);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
