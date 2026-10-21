public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, 0, 6, 7, 10};
        int  target = 22;
        int ans = binarySearch(arr,target);
        Sout(ans);
        static int binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while (start<= end){
                int mid = start + (end-start)/2;
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else if(target>arr){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }
}