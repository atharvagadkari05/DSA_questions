package longChallenges;

import java.util.Scanner;

public class CHEAPFUEL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            for (int i=1;i<=k;i++){
                x+=a;
                y+=b;
            }
            if(x>y){
                System.out.println("DIESEL");
            }else if(y>x){
                System.out.println("PETROL");
            }else {
                System.out.println("SAME PRICE");
            }
        }
    }
}
