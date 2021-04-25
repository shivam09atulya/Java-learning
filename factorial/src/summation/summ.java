package summation;
import java.util.*;
import factorial.factorial;
public class summ{
    public static double sum(int n)
    {
        double sum=0.0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+(double)i/factorial.fact(i);
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(sum(n));
    }
}