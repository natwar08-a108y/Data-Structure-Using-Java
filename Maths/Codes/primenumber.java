import java.util.Scanner;

public class primenumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt(); 
     // checks wether a number is prime or not 
    /*
    for(int i = 2;i*i<=n;i++){
            if(n%i==0){
              System.out.println(n + " is not prime");  
               return;
            }
    }
    System.out.println(n + " is prime");  
    */
    // to find n prime number 
    int n1 = 2;
    int count = 1;  
    boolean option = true;
   while (count<=n){
      for(int i = 2;i<n1;i++){
        if(n1%i==0){
        option = false;
         break;
      }
   }
   if(option){
    count++;
System.out.println(n1);
   }
n1++; 
option = true; 
   }
    }
}