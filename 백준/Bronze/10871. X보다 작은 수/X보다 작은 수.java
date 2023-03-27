import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<N;i++){
            if(X>a[i]){
                System.out.print(a[i]+" ");
            }
        }
        
    }
}