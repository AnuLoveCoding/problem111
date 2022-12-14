import java.util.Scanner;

public class problem19 {
    public static int max_min(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }
        }

        return max + min;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scn.nextInt();
        }

        System.out.println(max_min(arr));

    }
}
