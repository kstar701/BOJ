import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Kscore;
        int Sscore;
        int Ksum=0;
        int Ssum=0;
        for(int i=0;i<4;i++){
            Kscore = sc.nextInt();
            Ksum+= Kscore;
        }
        for(int i=0;i<4;i++){
            Sscore = sc.nextInt();
            Ssum += Sscore;
        }
        if(Ksum == Ssum){
            System.out.println(Ksum);
        }
        else if(Ksum > Ssum){
            System.out.println(Ksum);
        }
        else
            System.out.println(Ssum);
        sc.close();
    }
}
