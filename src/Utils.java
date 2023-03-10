public class Utils {
    public static int sum(int... nums)
    {
        int sum=0;
        for (int n: nums)
        {
            sum+=n;
        }
        return  sum;
    }
}
