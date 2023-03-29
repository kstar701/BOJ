import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int sum = Factorial(a);
        System.out.println(sum);

    }
        public static int Factorial(int N){
            if(N<=1)
                return 1;
            return N * Factorial(N-1);
        }
}