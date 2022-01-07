package longChallenges;

import java.util.Scanner;

public class UTKPLC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char pr1 = sc.next().charAt(0);
            char pr2 = sc.next().charAt(0);
            char pr3 = sc.next().charAt(0);
            char c1 = sc.next().charAt(0);
            char c2 = sc.next().charAt(0);


            char[] arr = {pr1,pr2,pr3};

           loop2: for(int i=0;i<3;i++){
                if(arr[i]==c1 || arr[i]==c2){
                    System.out.println(arr[i]);
                    break loop2;
                }
            }

        }
    }
}
