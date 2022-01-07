package longChallenges;
import java.util.Scanner;


// CODECHEF SEPT2021 LONG CHALLENGE
public class AIRLINE {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//int t = sc.nextInt();
//while(t-->0)
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int Yans = 0;
    int Nans= 0;
if(a+b<=d) {
    if (c <= e) {
        Yans++;
    } else {
        Nans++;
    }
} if (b+c<=d){
    if (a<=e){
        Yans++;
    }else {
        Nans++;

    }
} if (a+c<=d){
    if (b<=e){

        Yans++;
    }else {
       Nans++;
    }
}else {
    System.out.println("NO");
    return;
}

if(Yans>0){
    System.out.println("YES");
}
if(Nans==3){
    System.out.println("NO");
}


    }
}
