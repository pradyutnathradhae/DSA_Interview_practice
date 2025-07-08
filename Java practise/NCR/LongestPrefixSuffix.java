import java.util.Scanner;

public class LongestPrefixSuffix {
    int longestlength(String s,int n){
        int start = 0;
        for(int i = 1;i<n;i++){
            if(s.charAt(i)== s.charAt(start)){
                start ++;
            }
            else{
                start = 0;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int res[] = new int[T];
        LongestPrefixSuffix ob = new LongestPrefixSuffix();
        for(int i = 0;i<T;i++){
            String s = new String();
            s = sc.next();
            res[i] = ob.longestlength(s,s.length());
        }
        for(int i : res){
            System.out.println(i);
        }
    }
}
