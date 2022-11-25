import java.util.Scanner;

public class problem13 {
    public static int fabonnci_number(int n){
        int a =0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

        }

        return a ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your number");
        int n = scn.nextInt();

        System.out.println("The result of fabonnci number is "+fabonnci_number(n));
    }
}
