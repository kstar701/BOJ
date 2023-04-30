import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        int count = 0;
        String[] c = new String[b];
        for(int i=0;i<b;i++){
            c[i] = sc.next();
            if(c[i].equals(a))
                count++;
        }
        System.out.println(count);


    }
}