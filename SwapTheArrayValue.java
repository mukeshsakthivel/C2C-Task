import java.util.Scanner;

public class SwapTheArrayValue {
    public static void main(String args[])
    {

        Scanner in=new Scanner(System.in);
        System.out.print("size of array ");
        int q=in.nextInt();

        int b[]=new int[q];
        for(int i=0;i<q;i++) {
            System.out.printf("enter the number ");
            b[i]=in.nextInt();
        }

        int l=b.length-1;
     //  System.out.println(l);
        int temp = b[0];
        b[0] = b[l];
        b[l] = temp;

       // System.out.println(Arrays.toString(b));
        for(int i=0;i<=l;i++)
        {
            if(i==l)
                System.out.print(b[l]);
            else
                System.out .printf("%d,",b[i]);
        }
        System.out.println();

        for(int i=0;i<=l;i++)
        {
            if(i==l)
                System.out.print(b[l]);
            else
                System.out .printf("%d ",b[i]);
        }



    }
}
