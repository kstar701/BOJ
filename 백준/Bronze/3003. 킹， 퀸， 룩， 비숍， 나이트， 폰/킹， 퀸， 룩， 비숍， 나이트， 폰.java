import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int besqop = 2;
        int night = 2;
        int porn = 8;

        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        rook = rook - sc.nextInt();
        besqop = besqop - sc.nextInt();
        night = night - sc.nextInt();
        porn = porn - sc.nextInt();
        sc.close();
        System.out.print(king+" ");
        System.out.print(queen+" ");
        System.out.print(rook+" ");
        System.out.print(besqop+" ");
        System.out.print(night+" ");
        System.out.print(porn+" ");
    }
}
