public class Pattern_1{
    public static void main(String[] args) {
/*
*****
*****
*****
*****
*****
char star = '*';
for(int i = 0; i<=4;i++){
    for(int j = 0; j<5;j++){
        System.out.print(star);
    }
    System.out.println();
}
*/
/*
*
**
***
****
*****
*/
/*
char star = '*';
for(int i = 0; i<=4;i++){
   for(int j = 0; j<5;j++){
    if(i>=j){
        System.out.print(star);
    }
}

System.out.println();
}
*/
/*
*****
****
***
**
*

char star = '*';
for(int i = 0; i<=4;i++){
   for(int j = 0; j<5;j++){
    if(i<=j){
        System.out.print(star);
    }
}

System.out.println();
}
*/
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
/*
for(int i = 0; i<=4;i++){
   for(int j = 0; j<5;j++){
    if(i>=j){
        System.out.print(j+1);
    }
}
System.out.println();
}
*/
/*
*
**
***
****
*****
****
***
**
*
*/
/*
for (int i = 0; i <= 4; i++) {
    for (int j = 0; j <= 4; j++) {
        if (i >= j) {
            System.out.print("*");
        }
    }
    System.out.println();
}

for (int i = 3; i >= 0; i--) {
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
*/
/*
    *
   **
  ***
 ****
*****
 */
/*
char star = '*';
for(int i = 0;i<=4;i++){
     for(int j = 0; j<=4;j++){
      if(i+j>=4){
        System.out.print(star);
    }
    else{
        System.out.print(" ");
    }
     }
     System.out.println();
    }
*/
/*
*****
 ****
  ***
   **
    *     
*/
/*
char star = '*';
for(int i = 4;i>=0;i--){
     for(int j = 0; j<=4;j++){
      if(i+j>=4){
        System.out.print(star);
    }
    else{
        System.out.print(" ");
    }
     }
     System.out.println();
    }
*/
/*
         *
        * *
       * * *
      * * * *
     * * * * *  
*/
/*
int n = 5;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
    }

    for (int j = 0; j <= i; j++) {
        System.out.print("* ");
    }

    System.out.println();
}
*/
/* 
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= i; j++)
        System.out.print("* ");

    System.out.println();
}
*/
/*
        *
       ***
      *****
     *******
    *********
*/
/*
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i ; j++)
        System.out.print("*");

    System.out.println();
}
*/
/*
    *********
     *******
      *****
       ***
        *
*/
/*
for (int i = 4; i >= 0; i--) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i ; j++)
        System.out.print("*");

    System.out.println();
}
*/
/*
     * * * * *
      * * * *
       * * *
        * *
         *
 */
/*
for (int i = 4; i >= 0; i--) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= i; j++)
        System.out.print("* ");

    System.out.println();
}
*/
/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/
/*
for (int i = 4; i >= 0; i--) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= i; j++)
        System.out.print("* ");

    System.out.println();
}
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= i; j++)
        System.out.print("* ");

    System.out.println();
}
*/
/*
         *
        * *
       *   *
      *     *
     *********
*/
/*
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i; j++)
    if(j==0||j==2*i||i==4){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
    System.out.println();
}
*/
/*
     *********
      *     *
       *   *
        * *
         *
*/
/*for (int i = 4; i >= 0; i--) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i; j++)
    if(j==0||j==2*i||i==4){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
    System.out.println();
}
*/
/*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
*/
/*
for (int i = 0; i < 4; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i; j++)
    if(j==0||j==2*i){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
    System.out.println();
}
  for (int i = 4; i >= 0; i--) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= 2*i; j++)
    if(j==0||j==2*i){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
    System.out.println();
}
*/
/*
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
*/
/*
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i; j++)
        System.out.print("*");

    for (int j = 1; j <= 2*i; j++) 
        System.out.print(" ");

    for (int j = 5-i-1; j >=0; j--)
        System.out.print("*");
    System.out.println();
}
  for (int i = 4; i >= 0; i--) {
    for (int j = 0; j < 5 - i; j++)
        System.out.print("*");
    for (int j = 1; j <= 2*i; j++)
        System.out.print(" ");
    for (int j = 5-i-1; j >=0; j--)
        System.out.print("*");
    System.out.println();
}
*/
/*
for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5 - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j <= i; j++)
        System.out.print("* ");

    System.out.println();
}
*/
/*
pattern31(4);
    }
    
static void pattern31(int n) {
    int originalN = n;
    n = 2 * n;

    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int atEveryIndex = originalN
                - Math.min(
                    Math.min(row, col),
                    Math.min(n - row, n - col)
                );

            System.out.print(atEveryIndex + " ");
        }
        System.out.println();
    }
}
        */
    }
}