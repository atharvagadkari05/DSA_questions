package recursion101;

public class prob1 {
    public static void main(String[] args) {
         char[] s = {'h','e','l','l','o','e'};
         reverse(s,0,5);
         int a = s.length;
        System.out.println(s);
        System.out.println(a);
    }
    static char[] reverse(char[] s ,int start,int end) {

        if (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

          return   reverse(s, start + 1, end - 1);
        }else if(start==end){
            return s;

        }
        return s;
    }
}
