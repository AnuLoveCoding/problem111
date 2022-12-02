import java.util.Scanner;

public class Problem18 {
    public static int[] reverse_array(int [] arr){
        int [] arr1 = new int [arr.length];
        int  k = 0;

        for (int i = 0; i <arr.length ; i++) {
            arr1[k]=arr[i];
            k++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your size");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scn.nextInt();
        }


        int [] reverse = reverse_array(arr);

        System.out.println("Print value");
        for (int i = 0; i <reverse.length ; i++) {
            System.out.print(reverse[i]+" ");
        }
    }
}
