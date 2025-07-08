import java.util.Scanner;

public class MarksCalculate {
    public static void main(String[] args) {
        int res=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==1)
                res += 3;
            else
                res = res - 1; 
        }
        sc.close();
        System.out.println(res);
    }
}
