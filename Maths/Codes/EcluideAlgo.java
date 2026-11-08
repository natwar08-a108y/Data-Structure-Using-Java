//Application via recusion:
static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

//Applicattion via iteration:
static int gcd(int a, int b) {
    while (b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
}

//GCD of multiple number:
/*
gcd(a,b,c) = gcd(gcd(a,b),c)
Ex: gcd(12,18,30) = gcd(gcd(12,18),30) = gcd(6,30) = 6
*/
static int gcdArray(int[] nums) {
    int g = 0;
    for (int x : nums) {
        g = gcd(g, x);
        if (g == 1) return 1;//if gcd is 1 no need to check other 
    }
    return g;
}
// baaically 1 will be one of factor so it should end at 1 for every gcd 

// Relation between GCD and LCM:
//LCM = Product / GCD

static long lcm(int a, int b) {
    if (a == 0 || b == 0) return 0;
    return (long) (a / gcd(a, b)) * b;
}

// Time Complexity:
// O(log(min(a,b)))
/*
As we have studied Benzoat theorem : Total water = a.x + b.y where a & b should be integer now we know important thing this that if a number divides x and y perfectly it must divide total water also then the solution will be correct otherwise a and b will be fraction  because ax + by = gcd(a,b)

CONGRUENCES AND MODULAR ARITHMETIC — DSA NOTES

1. MODULO
a % m gives the remainder after dividing a by m.

Example: 17 % 5 = 2.

2. CONGRUENCE
a ≡ b (mod m) means m divides (a - b).
Equivalently, a and b have the same remainder modulo m.

3. IMPORTANT PROPERTIES
If a ≡ b (mod m) and c ≡ d (mod m):

Addition:
(a + c) % m = (b + d) % m

Subtraction:
(a - c) % m = (b - d) % m

Multiplication:
(a * c) % m = (b * d) % m

4. LARGE NUMBER CALCULATIONS
Reduce operands modulo m before calculating whenever the arithmetic is safe.

5. DSA APPLICATIONS
- Large-number calculations.
- Modular exponentiation.
- Circular arrays and repeating patterns.
- Counting combinations modulo a number.
- Modular inverses and number theory.

6. JAVA CAUTION
Java's % operator can return a negative remainder for negative operands.
For a normalized nonnegative remainder, use Math.floorMod(a, m) when m is positive.

7. OVERFLOW CAUTION
Even long multiplication can overflow before % is applied.
Reducing operands helps but does not always prevent overflow.
*/
static long multiplyMod(long a, long b, long mod) {
    return ((a % mod) * (b % mod)) % mod;
}