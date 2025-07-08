import java.util.Scanner;

public class ComputeLogicOperation {
    static int operate(char op,int a,int b){
        int res=0;
        if(op == 'A'){
            res = a & b;
        }
        else if(op == 'B'){
            res = a | b;
        }
        else{
            res = -1;
        }
        return res;
    }
    int compute(String s){
        int res = 0,temp;
        char operation = ' ';
        if(s.charAt(0) == 48 || s.charAt(0)==49)
            res = Integer.parseInt(s.substring(0,1)); 
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == 48 || s.charAt(i)==49){
                temp = Integer.parseInt(s.substring(i,i+1));
                res = ComputeLogicOperation.operate(operation, res, temp);
            }
            else{
                operation = s.charAt(i);
            } 
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s= sc.next();
        ComputeLogicOperation ob = new ComputeLogicOperation();
        System.out.println(ob.compute(s));
        sc.close();
    }
}
