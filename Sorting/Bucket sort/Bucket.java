import java.util.*;

public class BucketSort {

    public static void bucketSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];

        // Find maximum element
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create buckets
        int bucketCount = arr.length;
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];

        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put elements into buckets
        for (int num : arr) {
            int index = (num * bucketCount) / (max + 1);
            buckets[index].add(num);
        }

        // Sort each bucket
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets
        int index = 0;

        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {42, 32, 33, 52, 37, 47, 51};

        bucketSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}