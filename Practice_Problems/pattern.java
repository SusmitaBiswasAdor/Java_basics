
package Practice_Problems;
import java.util.Scanner;
public class pattern {
       /**
        * @param args
        */
       public static void main(String[] args)
       {
              //Patterns
              //1 
              //Solid rectangle
              
              Scanner sc = new Scanner(System.in);
              System.out.print("give the value of rows: ");
              int r = sc.nextInt();
              System.out.print("give the value of cols: ");
              int c = sc.nextInt();
              //-----------------Pattern 1---------------------
              //  * * * * *
              //  * * * * *
              //  * * * * *
              //  * * * * *
              //  * * * * *
              System.out.println("Pattern 1: Solid Rectangle");
              for (int i = 1; i<=r; i++)
              {
                     for (int j=1; j<=c; j++)
                     {
                            System.out.print(" * ");
                     }
                     System.out.println();
              }
              //-------------------------------------------------
              //-----------------Pattern 2---------------------
              //  * * * * *
              //  *       *
              //  *       *
              //  *       *
              //  * * * * *
              System.out.println("Pattern 2: Hollow Rectangle");
              for (int i = 1; i<=r; i++)
              {
                    
                            for (int j=1; j<=c; j++)
                            {
                                   if (i==1||j==1||i==r||j==c)
                                   {
                                          System.out.print(" * ");
                            
                                   }
                                   else System.out.print("   ");

                            }
                            System.out.println();
                     }
              
              //-------------------------------------------------
              //-----------------Pattern 3---------------------
              //  *
              //  * *
              //  * * *
              //  * * * *
              //  * * * * *
              System.out.println("Pattern 3: Right Triangle");
                             for (int i = 1; i<=r; i++)
                            {
                                   for (int j=1; j<=i; j++)
                                   {
                                          System.out.print(" * ");
                                   }
                                   System.out.println();
                            }
                     
              //-------------------------------------------------
              
              //-----------------Pattern 4---------------------
              //  * * * * *
              //    * * * *
              //      * * *
              //        * *
              //          *
              System.out.println("Pattern 4: Inverted Right Triangle");
            
              for (int i = 1; i<=r; i++){
                     for (int j = 1 ; j<=r-i; j++){
                            System.out.print(" ");

                     }
                     for (int j = 1; j<=i; j++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
              //-------------------------------------------------

              //-----------------Pattern 5---------------------
              // 1
              // 12
              // 123
              // 1234
              // 12345
              System.out.println("Pattern 5: Number Triangle");
              for (int i=1; i<=r; i++){
                     for (int j = 1; j<=i; j++){
                            System.out.print(j);
                     }
                     System.out.println();
              }
              //---------------------------------------------------
              //------------------Pattern 6----------------------
              // 12345
              // 1234
              // 123
              // 12
              // 1
              System.out.println("Pattern 6: Inverted Number Triangle");
              for (int i = 0; i<=r; i++){
                     for (int j = 1; j<=r-i; j++){
                            System.out.print(j);
                     }
                     System.out.println();
              }
              //---------------------------------------------------
              //------------------Pattern 6------------------------
                                   // 1
                                   // 2  3
                                   // 4  5  6
                                   // 7  8  9  10
                                   // 11  12  13  14  15
              System.out.println("Pattern 6: Number Triangle");
              int num = 1;
              for (int i = 1; i<=r; i++){
                     for (int j = 1; j<=i; j++){
                            
                            System.out.print(" "+num+" ");
                            num++;  ///it updates 

                     }
                     System.out.println();
              }
              //------------------------------------------------------------

              //-----------------------Pattern 7---------------------------
              // 1
              // 01
              // 101
              // 0101

              System.out.println("Pattern 7: Binary Triangle");
              for (int i = 1; i<=r; i++){
                     for (int j = 1 ; j<=i; j++){
                            if ((i+j)%2==0){
                                   System.out.print(1);
                            }
                            else 
                            System.out.print(0);
                     }
                     System.out.println(); 
              }
              //-----------------------------------------------
              //----------------Pattern 8-----------------
              //     *****
              //    *****
              //   *****
              //  *****
              // *****
              System.out.println("Pattern 8: Inverted Solid Triangle");
              for (int i = 1; i<=r; i++){
                     for (int j = 1 ; j<=r-i; j++){
                            System.out.print(" ");
                     }
                     for (int j = 1; j<=r; j++){
                            System.out.print("*");
                     }

              System.out.println();
              }

              //----------------Pattern 9-----------------
                     
                            //         1
                            //        2 2
                            //       3 3 3
                            //      4 4 4 4
                            //     5 5 5 5 5
              System.out.println("Pattern 9: Number Triangle");
              for (int i=1; i<=r; i++){
                     for(int j=1; j<=r-i; j++ ){
                            System.err.print(" ");
                                   }
                     for (int j = 1; j<=i; j++){
                            System.err.print(i+" ");
                     }
                     System.out.println();
                            }
              //-------------------------------------------

              //----------------Pattern 10-----------------
              //palindrome number triangle
                     //         1
                     //        212
                     //       32123
                     //      4321234
                     //     543212345
              System.out.println("Pattern 10: Palindrome Number Triangle");
              for (int i = 1; i<=r; i++)
              {
                     for (int j = 1; j<=r-i; j++){
                            System.out.print(' ');
                     }
                     for (int j = i; j>=1; j--){
                            System.out.print(j);
                     }
                     for (int j = 2; j<=i; j++){
                            System.out.print(j);
                     }
                     System.out.println();
              }
                            
                     }
                    
              }


       

              



       

