import java.util.Scanner;
public class DivisorBtw3And5 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        //int res=Calculator(m,n);
        System.out.println("The result is "+Calculator(m,n));
    }
    public static int Calculator(int m,int n)
    {
        int sum=0;
        for(int i=m;i<n;i++)
        {
            if((i%3==0)&&(i%5==0)) {
                System.out.print(i + " ");
                sum += i;
            }
        }return sum;
    }
}
