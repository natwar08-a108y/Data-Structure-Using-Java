public class SumOfDivisors {

    static long sumDivisors(int n) {

        long ans = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                int count = 0;

                while (n % i == 0) {
                    n /= i;
                    count++;
                }

                long sum = ((long) Math.pow(i, count + 1) - 1)
                         / (i - 1);

                ans *= sum;
            }
        }

        if (n > 1)
            ans *= (n + 1);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sumDivisors(360));
    }
}