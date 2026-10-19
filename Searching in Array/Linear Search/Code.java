public class Code{
    public static void main(String[] args){
        int[] nums = {23, 45, 56, 78, 89}; //Array declaration 
        int target = 78;
        int result = LinearSearch(nums, target);
        System.out.println(result);
    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
    return -1;
    }
}