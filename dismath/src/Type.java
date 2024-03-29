import java.util.Scanner;
public class Type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = new int[1000001];
        int type = 2;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = i;
            if (num>1 && num%nums[i]==0 && num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0) {
                type = 1;
            }
        }
        if (type==1 || num==2 || num==3 || num==5 || num==7) {
            System.out.println("Число "+"'"+num+"'"+" является простым числом");
        } else {
            System.out.println("Число "+"'"+num+"'"+" является составным числом");
        }
    }
}
