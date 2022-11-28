import java.util.Scanner;

public class problem12 {
    public static int [] first_last(int [] arr ,int b){
        int [] c= new int [2];

        int fi =-1;
        int li =-1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                fi = arr[i];
                c[0] =fi;
                break;
            }
        }

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i]==b){
                li =arr[i];
                c[1]=li;
                break;
            }
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scn.nextInt();
        }

        int b = scn.nextInt();
    }
}
