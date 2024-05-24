//Casting means type conversion
// double datatype's capacu=ity is 8 bytes and int datatype's capacity is 4 bytes. so a double type 
//needs to be casted to int type
// int price = 115;
// int FinalPrice = 115+5.00; //this will give an error as the double type is not casted to int type
// int needs to be casted to double type as double has more capacity than int
// This going from smaller datatype to bigger datatype is called **implicit casting.** This is allowed automatically by java.
// This going from bigger datatype to smaller datatype is called **explicit casting.**



public class casti {
       public static void main(String[] args)
       {
              //implicit casting
              double price = 110.00;
              double FinalPrice = price + 10; //this is allowed as double has more capacity than int
              System.out.println("Implicit Casting Price:"+FinalPrice);
              //explicit casting
              int p1 = 110;
              int p2 = p1 + (int)10.00; //this is allowed as int has less capacity than double
              int p3 = p1 + (int)10.99; //.99 is being truncated or lost due to explicit casting
              System.out.println("Expricit Casting price:"+p2);
              System.out.println("Expricit Casting price:"+p3);
       }


       
}
