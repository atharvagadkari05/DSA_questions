package leetcode;

import java.util.Scanner;

//  (https://leetcode.com/problems/defanging-an-ip-address/)  --->  Strings
public class Prob1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String address = sc.nextLine();
    String defang = "";

    for(int i=0;i<address.length();i++) {
        if (address.charAt(i) == '.') {
            defang+="[.]";
        }else {
            defang+=address.charAt(i);
        }

    }

        System.out.println(defang);
    }


}
