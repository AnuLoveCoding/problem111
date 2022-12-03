import java.util.Scanner;

public class problem20 {
    public static int second_largest(int [] arr){
        int max = arr[0];
//        int max_index =-1;
        int secondlargest = -1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
//                max_index = i;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>secondlargest && arr[i]!=max){
                secondlargest = arr[i];
            }
//            else if (arr[i]==max && arr[i]!=max_index) {
//                secondlargest = arr[i];
//            }
        }




        return secondlargest;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your arr size");
        int n = scn.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scn.nextInt();
        }

        System.out.println("Print the value");
        int Second = second_largest(arr);

        System.out.println(Second);
    }
}
