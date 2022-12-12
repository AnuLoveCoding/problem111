public class problem25 {
    public static void main(String[] args) {
//        int [] arr = new int[21];
         int arr [] = {1,2,3,4};
//         1
//        12
//        13
//        14
//        2
//        23
//        24
//        3
//        34
//        4

            int count = 0;
            int m = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    count++;

                }
            }
        }

        System.out.println(count);

    }
}
