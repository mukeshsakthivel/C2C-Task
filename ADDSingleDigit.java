import java.util.Arrays;
import java.util.Scanner;

public class ADDSingleDigit {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int re=ADDSingleDigit.meth(a);
        System.out.println(re);

        }

    public static int meth(int val) {
        if (val < 10) {
            return val;
        }
        int sum = 0;
        while (val != 0) {
            sum += val % 10;
            val /=  10;
        }
        return meth(sum);




    }


}
