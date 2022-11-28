import java.util.Scanner;

public class problem12 {
    public static int [] first_last(int [] arr ,int b){
        int [] c= new int [2];

        int fi =-1;
        int li =-1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                fi = i;
                c[0] =fi;
                break;
            }
        }

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i]==b){
                li = i;
                c[1]=li;
                break;
            }
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        (Q.1) find the first_index and last_index of array;
            System.out.println("Enter Your arr size");
            int n = scn.nextInt();
            int [] arr = new int [n];

            System.out.println("Enter your arr value");
            for (int i = 0; i < arr.length ; i++) {
                arr[i]= scn.nextInt();
            }

            System.out.println("Enter your search value");
            int b = scn.nextInt();

            int [] arr1 = first_last(arr,b);

            for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }

    }
}
