import java.util.Scanner;
import java.util.HashMap;

public class CompressString {
    String compress(String s){
        String s1 = "";
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(int i = 0;i<s.length();i++){
            String temp = s.substring(i,i+1);
            if(h.containsKey(temp)){
                h.replace(temp, h.get(temp)+1);
            }
            else{
                h.put(temp,1);
            }    
        }
        for(String i : h.keySet()){
            if(h.get(i) == 1)
                s1 = s1 + i; 
            else
                s1 = s1 + i + Integer.toString(h.get(i));
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        CompressString ob = new CompressString();
        System.out.println(ob.compress(st));
        sc.close();
    }
}
