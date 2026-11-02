public class Insertion{
    public static void main(String[] args) {
        int[] arr = {2,4,3,9,7,10};
           Insertion(arr);   
           for(int i = 0; i<arr.length;i++){
               System.out.println(arr[i]);
           }
    }
    static void Insertion(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
               if (min>arr[i]){
                 int temp=arr[i];
                    arr[i]=min;
                    min=temp;
                    
               }
        }
    }
    }