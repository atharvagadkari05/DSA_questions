package longChallenges;

import java.util.Scanner;

public class TRAVELPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
           int ans = 0;
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
                sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray(); //  This convert string s to a character array

            for (int i = 0; i<N;i++){

                if(ch[i]=='0'){
                    ans +=A;
                }else{
                    ans+=B;
                }
            }

            System.out.println(ans);

        }

    }
}
