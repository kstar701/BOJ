import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];
        String input = br.readLine();

        for(int i=0;i<input.length();i++){
            count[(int)input.charAt(i)-97]+=1;
        }
        for(int i=0;i<count.length;i++){
            sb.append(count[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}