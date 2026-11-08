public class SquareRoot {
    public static void main(String[] args) {
        double start = 0;
        double end = 40;
        double num = 40;
        
        // Loop runs until the gap between start and end is extremely small
        while ((end - start) > 0.0000001) {
            double mid = start + (end - start) / 2.0;
            
            if (mid * mid < num) {
                start = mid; // Move the lower bound up
            } else {
                end = mid;   // Move the upper bound down
            }
        }
        
        // Print the highly accurate result
        System.out.print("Square root is: " + start);
    }
}
