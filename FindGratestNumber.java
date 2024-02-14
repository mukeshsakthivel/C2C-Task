import java.util.Scanner;

public class FindGratestNumber {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int b=0;
        while(n!=0)
        {
            int a=n%10;
            if(a>b)
                b=a;
            n=n/10;
        }
        System.out.println(b);
    }
}
