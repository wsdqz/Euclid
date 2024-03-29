import java.util.Scanner;
public class Euclid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int nod = 0;
        if (n!=0 && m!=0) {
            System.out.print("НОД("+n+","+m+") равен "+"'");
            while (m!=0){
                int ost = n%m;
                n = m;
                m = ost;
            }
            System.out.println(n+"'");
        }
    }
}
