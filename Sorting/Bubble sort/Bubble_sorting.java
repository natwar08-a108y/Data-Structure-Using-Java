public class Bubble_Sorting{
    public static void main(String[] args) {
        int[] arr = {2,4,3,9,7,10};
          //Bubble(arr);
          //selection(arr);
          insertion(arr); 
           for(int i = 0; i<arr.length;i++){
               System.out.println(arr[i]);
           }

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
     static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void Bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i<arr.length;i++){
            swapped = false;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                 int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                   swapped = true; 
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
}