public class NumberContains5 {
    public static void main(String args[])
    {
        for(int i=1;i<=999;i++)
            if(i==5||i%10==5||i/10==5||i/100==5||i%100/10==5)
                System.out.println(i);
    }
}
