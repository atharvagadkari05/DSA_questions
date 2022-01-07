package longChallenges;
import java.util.Scanner;
public class GOODWEAT {
    /* package codechef; // don't place package name! */



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while(t-->0){
                int[] arr = new int[7];
                for(int i=0;i<7;i++){
                    arr[i]= sc.nextInt();
                }
                int sunny = 0;
                int rainy=0;


                for(int i=0;i<7;i++){
                    if(arr[i]==1){
                        sunny++;
                    }else{
                        rainy++;
                    }
                }

                if(sunny>rainy){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }




            }
        }
    }

