import java.util.Scanner;

public class LeadersInArray{
    void find_leaders(int arr[],int n){
        int i = n - 1;
        int rval=arr[n-1]-1;
        for(;i>=0;i--){
            if(arr[i]>rval){
                System.out.print(arr[i] + " ");
                rval = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        LeadersInArray ob = new LeadersInArray();  
        ob.find_leaders(arr,n);
    }
}