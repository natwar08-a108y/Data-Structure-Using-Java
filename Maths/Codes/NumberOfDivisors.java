public class NumberOfDivisors {

    static int countDivisors(int n) {

        int ans = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                int count = 0;

                while (n % i == 0) {
                    n /= i;
                    count++;
                }

                ans *= (count + 1);
            }
        }

        if (n > 1)
            ans *= 2;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countDivisors(360));
    }
}