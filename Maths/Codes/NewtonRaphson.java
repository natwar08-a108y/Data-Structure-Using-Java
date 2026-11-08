public class NewtonRaphson{
    public static void main(String[] args) {
/*
root = (x + N/x)/2
*/        
System.out.println(sqrt(40));
    }
    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
}
/*
20
↓
11
↓
7.3
↓
6.4
↓
6.325
↓
6.324555...

Time Complexity:
O((log N) * f(N))
*/