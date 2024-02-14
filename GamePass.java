import java.util.Arrays;
import java.util.Scanner;

public class GamePass {
    public static void main(String args[])
    {
        int a[]=new int[10];
        Scanner in=new Scanner(System.in);
        String st=in.next();
        for(int i=0;i<st.length();i++)
        {
            a[i] = Integer.parseInt(String.valueOf(st.charAt(i)));
        }
      //  System.out.println(Arrays.toString(a));

        int sum=0;
        int i=0,pass=1;
        for(;i<=9;i++)
        {
            sum=sum+a[i];
            if(sum%2==0)
            {
                System.out.println(sum+" - pass"+pass++);
                sum=0;
            }}

    }
}
