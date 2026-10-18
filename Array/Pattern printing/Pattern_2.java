public class Pattern_2{
    public static void main(String[] args) {
/*        
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
*/
//spiral Matrix
/*
        int[][] matrix = new int[7][7];
        int top = 0;
        int bottom = 6;
        int left = 0;
        int right = 6;
        int number = 4;
        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
               matrix[top][j] = number;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
               matrix[i][right] = number;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = number;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = number;
                }
                left++;
            }
        number--;
        }
        for(int i = 0; i<=6;i++){
            for(int j = 0; j<=6;j++){
                System.out.print(matrix[i][j]+" " );
            }
            System.out.println();
        }
        */
/*       
E 
D E 
C D E 
B C D E 
A B C D E */
/*
String[] letter = {"A","B","C","D","E"};
for(int i = letter.length-1;i>=0;i--){
    for(int j = i;j<=letter.length-1;j++){
     System.out.print(letter[j]+" ");
}
 System.out.println();
}
*/
/*
E D C B A 
D C B A 
C B A 
B A 
A 
*/
/*
String[] letter = {"A","B","C","D","E"};
for(int i = 0;i<=letter.length-1;i++){
    for(int j = letter.length-1-i;j>=0;j--){
     System.out.print(letter[j]+" ");
}
 System.out.println();
}
*/
/*
a 
B c 
D e F 
g H i J 
k L m N o */
/*
 char ch = 'a';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                if ((ch - 'a') % 2 == 0) {
                    System.out.print(Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }

                ch++;
            }
            System.out.println();
        }
        */
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
/*
       int count = 1;
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
                } 
                System.out.println();
} 
*/
/*
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1
 */
/*
int count = 1; 
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        if (count%2==0)
            System.out.print("0 ");
        else
            System.out.print("1 ");
         count++;        
            } 
                System.out.println();
} 
*/
/*
1 1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 
4 4 4 
5 5 
6 
 */
/*
int count = 1; 
for (int i = 6; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
            System.out.print(count +" ");     
            } 
            count++;
                System.out.println();
}
*/
/*
      1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11
*/
/*
int count = 1;
int great = 20;

for (int i = 4; i >= 1; i--) {
    for (int j = 0; j < 4 - i; j++) {
        System.out.print("  ");
    }

    for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;
    }

    for (int j = 1; j <= i; j++) {
        System.out.print(great - i + j + " ");
    }

    great -= i;
    System.out.println();
}
*/
}
}