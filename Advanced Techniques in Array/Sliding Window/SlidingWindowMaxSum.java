public class SlidingWindowMaxSum {

    public static int findMaxSubarraySum(int[] arr, int w) {
        // Edge case: If the array is empty or window size is invalid
        if (arr == null || arr.length == 0 || w <= 0 || w > arr.length) {
            return 0; 
        }

        int n = arr.length;
        int current = 0;

        for (int i = 0; i < w; i++) {
            current += arr[i];
        }

        int maxx = current;

        for (int i = 1; i <= n - w; i++) {
        current = current - arr[i - 1] + arr[i + w - 1]; 
         if (current > maxx) {
                maxx = current;
            }
        }

        return maxx;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int w = 3;

        int result = findMaxSubarraySum(arr, w);
        
        System.out.println("The maximum sum of a subarray of size " + w + " is: " + result);
    }
}
