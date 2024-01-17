import java.io.*;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;


public class Main {

    static int count = 0;
    public static int recursion(String s, int l, int r){
        count++;

        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int cas = Integer.parseInt(br.readLine());

        for(int i = 0; i< cas; i++){
            count = 0;
            sb.append(isPalindrome(br.readLine())).append(" ").append(count).append('\n');
        }


        System.out.println(sb);
    }


}

