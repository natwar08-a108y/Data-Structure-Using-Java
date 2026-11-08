RESIDUE CLASSES — DSA NOTES

1. DEFINITION
A residue class modulo m contains all integers having the same remainder when divided by positive integer m.

2. NUMBER OF RESIDUE CLASSES
There are exactly m residue classes modulo m:
[0], [1], ..., [m - 1].

3. CONGRUENCE
a ≡ b (mod m) if and only if m divides (a - b).

Equivalent interpretation:
a and b belong to the same residue class modulo m.

4. EXAMPLE
17 ≡ 5 (mod 6), because 17 - 5 = 12 is divisible by 6.

5. IMPORTANT DSA PROPERTY
Two prefix sums P[i] and P[j] have the same remainder modulo k if and only if their difference is divisible by k.

Therefore:
(P[j] - P[i]) % k == 0
when their normalized remainders match.

6. DSA APPLICATIONS
- Grouping numbers by remainder.
- Counting subarrays divisible by k.
- Prefix sums + HashMap/frequency array.
- Circular indexing and repeating patterns.

7. JAVA TIP
Use Math.floorMod(value, k) for normalized remainders when k is positive and values may be negative.

8. RELATED LEETCODE
974. Subarray Sums Divisible by K.
523. Continuous Subarray Sum.
189. Rotate Array (related modulo application).

solve question no. 974