public class singleDogitOperation {
    public static void main(String args[])
    {
        int n=1679583;
        int a=77;
        System.out.println("The addition = "+singleDogitOperation.addition(n,0));
        System.out.println("The multiplication = "+singleDogitOperation.multiplication(a,0));
    }
    static int addition(int n,int i)
    {
        if(n<10){
            System.out.println("the iteration is "+i);
            return n;}
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
       // System.out.println(sum);
        i++;
        return addition(sum,i);
    }
    static int multiplication(int n,int i)
    {

        if(n<10){
            System.out.println("the iteration is "+i);
            return n;
        }

        int sum =1;
        while(n!=0)
        {
             sum=sum*(n%10);
             n=n/10;
        }
        i++;
        return multiplication(sum,i);
    }
}
