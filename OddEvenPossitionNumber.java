import java.util.Scanner;

public class OddEvenPossitionNumber {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();

        String o="",e="";
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0) {
                o=o+a.charAt(i);
            }
                else
                e=e+a.charAt(i);
        }
        System.out.println("odd position number "+o);
        System.out.println("even positon number "+e);


        
    }
}
