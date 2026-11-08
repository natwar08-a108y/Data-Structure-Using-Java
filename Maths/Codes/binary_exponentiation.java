static long modPow(long a, long b, long mod) {
    long result = 1;
    a %= mod;

    while (b > 0) {
        if ((b & 1) == 1) {
            result = result * a % mod;
        }

        a = a * a % mod;
        b >>= 1;
    }

    return result;
}

static long modInverse(long a, long mod) {
    return modPow(a, mod - 2, mod);
}

/**
 MODULAR EXPONENTIATION AND MODULAR INVERSE

1. Binary Exponentiation
- Calculates a^b % mod efficiently.
- Repeatedly squares the base and halves the exponent.
- If exponent is odd, multiply result by the current base.
- Time complexity: O(log b).

2. Important Java operations
- (b & 1) == 1: checks whether b is odd.
- b >>= 1: divides b by 2.
- a = a * a % mod: squares base while keeping remainder.

3. Modular Inverse
- Inverse x satisfies (a * x) % mod = 1.
- Inverse exists iff gcd(a, mod) = 1.
- If mod is prime and a % mod != 0:
  inverse(a) = a^(mod-2) % mod.
- This formula comes from Fermat's Little Theorem.
- For composite mod, use Extended Euclidean Algorithm when an inverse exists.

4. Applications
- Modular division.
- Factorial and nCr calculations.
- Competitive programming problems involving modular powers.

5. LeetCode
- 372. Super Pow — directly relevant to modular exponentiation.
- 1922. Count Good Numbers — uses modular exponentiation; inverse is not required in the standard solution.
 */