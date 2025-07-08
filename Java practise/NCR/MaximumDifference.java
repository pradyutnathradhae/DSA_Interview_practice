import java.util.Scanner;

public class MaximumDifference {
    int maxdiff(int arr[],int n){
        int diff = arr[1]-arr[0];
        int minelt = arr[0];
        for(int  i = 1;i<n;i++){
            if(arr[i]-minelt > diff){
                diff = arr[i]-minelt;
            }
            if(minelt>arr[i]){
                minelt = arr[i];
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MaximumDifference ob = new MaximumDifference();
        sc.close(); 
        System.out.println(ob.maxdiff(arr,n));   
    }
}
