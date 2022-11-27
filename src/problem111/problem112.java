package problem111;

import java.util.Scanner;

public class problem112 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your Input : ");
        String sentence = scn.nextLine();

        String vowel ="";
        String consonant = "";

        for (int i = 0; i <sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel+=ch;
            }else if(ch==' '){
                 continue;
            } else {
                consonant+=ch;
            }
        }

        System.out.println(vowel.toUpperCase());
        System.out.println(consonant.toLowerCase());


    }
}
