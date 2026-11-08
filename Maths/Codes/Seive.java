public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    // here we are excluding multiples of primes  
    // false in array means number is prime
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
Time Complexity :
For the 1st time loop will run it will have n/2 terms then n/3 then n/5 then n/7
n(1/2+1/3+1/5+1/7....)
Harmonic progression:
log(log n)
total time complexity: O(N*log(log N))
 */