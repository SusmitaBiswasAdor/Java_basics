// //Operators in Java
// Operators are 4 types in java
// Arithmetic Operators, Assignment Operators, Logical Operators, comparison Operators
// if else statement are related to Logical Operators, comparison Operators

// Operators (Arithmatic,Assignment)
public class operate {

       public static void main(String[] args)
       {
              // //Arithmetic Operators
              int a = 100;
              int b = 200;   
              int sum = a+b;
              int diff = a-b;
              int mul = a*b;
              float div = (float)a / (float)b; // int div = a/b;  //due to being in int the result is showing 0 instead of 0.5
              float mod = (float)a % (float)b; // to get the correct result we need to cast the result to double
              
              System.out.println("Sum:"+sum +"\nDifference:"+diff +"\nMultiplication:"+mul +"\nDivistion:"+div +"\nModulus:"+mod);
              
              //unary operators
              int x = 10;
              // x+=1; which means x = x+1. will increase the value of x by 1
              // in java there operators
              // ++x; //pre increment
              // x++; //post increment
              int z= ++x; //pre increment
              int y = x++; //post increment
              System.out.println("Assignment Operator pre increment(+):"+ y);
              System.out.println("Assignment Operator post ivcrement(+):"+ z);

              //--x; //pre decrement
              //x--; //post decrement
              int w = --y; //pre decrement
              int v = y--; //post decrement
              System.out.println("Assignment Operator pre decrement(-):"+ w);
              System.out.println("Assignment Operator post decrement(-):"+ v);

              


       }

       
}
