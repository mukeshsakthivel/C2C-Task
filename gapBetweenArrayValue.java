import java.util.Arrays;

public class gapBetweenArrayValue {
    public static void main(String args[])
    {
        int a[]={9,4,26,26,0,0,5,20,6,25,5};
        Arrays.sort(a);
        int index=0,diff=-1;
        for( int i=a.length-1;i>0;i--)
        {
            int sub=a[i]-a[i-1];
            if(sub>diff)
            {
                diff=sub;
                index=i;
            }
        }
        System.out.println("The gratest difference between is "+a[index-1]+" and "+a[index]);
    }
}
