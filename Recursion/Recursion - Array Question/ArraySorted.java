public class ArraySorted {

   public static void main(String[] args) {
    int[] array = {11, 56, 7, 5, 3};
    int[] arr = {1, 2, 3, 5, 6, 8};
      System.out.println(sorted(array, 0));
       System.out.println(sorted(arr, 0));
   }

   static boolean sorted(int[] arr, int index) {
      // Matlab ki agar index akhiri element-1 hogaya tho pura check ho gaya yani true
      if (index == arr.length - 1) {
            return true;
        }
      return arr[index] < arr[index + 1] && sorted(arr, index + 1);
      // && operator hai agar ek bhi volate hua tho false.
}
}