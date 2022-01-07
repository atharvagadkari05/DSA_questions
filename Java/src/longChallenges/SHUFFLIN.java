package longChallenges;

import java.util.Scanner;

public class SHUFFLIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();

while (t-->0){
    int N = sc.nextInt();
    int[] A = new int[N];
    int A_even=0;
    int A_odd=0;
    for (int i=0;i<N;i++){
        A[i] = sc.nextInt();
    }
    // Determining no. of even and odd in A
    for(int i=0;i<N;i++){
        if (A[i]%2==0){
            A_even++;
        }else{
            A_odd++;
        }
    }
    // Determining no. of even and odd in Indices
    int i_even = N/2;
    int i_odd = N-i_even;
    int Ans;
 if ((A_even-i_odd==0) && (A_odd-i_even==0)){
     Ans = N;
     System.out.println(Ans);

 }else {
     Ans = Math.min(A_even, i_odd) + Math.min(A_odd, i_even);

     System.out.println(Ans);
 }

}
    }
}
