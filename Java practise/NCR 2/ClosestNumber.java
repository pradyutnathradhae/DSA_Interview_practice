import java.util.Scanner;

public class ClosestNumber {
    int findclosest(int n,int m){
        int res=0;
        int q = n / m;
        if(q>0){
            res = Math.max(Math.abs(n-q*m), Math.abs(n-(q+1)*m));
        }
        else{
            res = Math.max(Math.abs(n-q*m), Math.abs(n-(q-1)*m));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ClosestNumber c = new ClosestNumber();
        System.out.println(c.findclosest(n,m));
    }
}
