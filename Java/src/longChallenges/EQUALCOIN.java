package longChallenges;

import java.util.Scanner;

public class EQUALCOIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int ans = x + 2*y;

            if(ans%2==0){
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
