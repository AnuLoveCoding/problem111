import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        (Q.1) Given an integer A, you need to find the count of it's factors.
        int n=scn.nextInt();
        int count =0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }

        System.out.println(count);

    }
}
