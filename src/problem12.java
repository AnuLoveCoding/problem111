import java.util.Scanner;

public class problem12 {
//    public static int [] first_last(int [] arr ,int b){
//        int [] c= new int [2];
//
//        int fi =-1;
//        int li =-1;
//
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==b){
//                fi = i;
//                c[0] =fi;
//                break;
//            }
//        }
//
//        for (int i = arr.length-1; i>=0 ; i--) {
//            if(arr[i]==b){
//                li = i;
//                c[1]=li;
//                break;
//            }
//        }
//
//        return c;
//    }

//    (Q.2)  Insert that
//    public static int [] insert_element(int [] arr ,int x ,int y){
//        int n = arr.length;
//        int [] ans = new int [n+1];
//
//        for (int i = 0; i < x ; i++) {
//            ans[i]=arr[i];
//        }
//
//        ans[x] = y ;
//
//        for (int i = x+1; i <ans.length; i++) {
//            ans[i] = arr[i - 1];
//
//        }
//        return  ans;
//    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        (Q.1) find the first_index and last_index of array;
//            System.out.println("Enter Your arr size");
//            int n = scn.nextInt();
//            int [] arr = new int [n];
//
//            System.out.println("Enter your arr value");
//            for (int i = 0; i < arr.length ; i++) {
//                arr[i]= scn.nextInt();
//            }
//
//            System.out.println("Enter your search value");
//            int b = scn.nextInt();
//
//            int [] arr1 = first_last(arr,b);
//
//            for (int i = 0; i <arr1.length ; i++) {
//            System.out.print(arr1[i]+" ");
//         }

//       (Q.2) Insert that <>(); Write a program to input N numbers array, a number X and a number Y
//       from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

//              System.out.println("Enter your arr size");
//              int n  = scn.nextInt();
//              int [] arr = new int [n];
//              int [] ans = new int [n+1];
//
//                 System.out.println("Enter your arr value");
//                for (int i = 0; i < arr.length ; i++) {
//                    arr[i] = scn.nextInt();
//                }
//
//             System.out.println("Enter your insert index");
//            int x = scn.nextInt()-1;
//            System.out.println("Enter your insert value");
//            int y = scn.nextInt();
//
//            int [] ans1 = insert_element(arr,x,y);
//
//            for (int i = 0; i <ans1.length ; i++) {
//                System.out.print(ans1[i]+" ");
//            }

//        (Q.3)  Right Shift an Array </>;
            int n = scn.nextInt();
            int [] arr = new int [n];

            for (int i = 0; i <arr.length ; i++) {
                arr[i]=scn.nextInt();
            }

            int last_element = arr[arr.length-1];

            for(int i=arr.length-1;i>=1;i--){
                arr[i] =arr[i-1];
            }

            arr[0]=last_element;


        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
