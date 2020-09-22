package com.medasele;

public class Swapping2Numbers {

    public static void main(String[] args) {

	    // Logic 1  using third variable

        int a = 10;
        int b = 20 ;

        System.out.println("Before Swapping : a = " +a+ " b= " +b);

       /* int c= a; // c = 10
        a=b;      // a=20
        b=c;     // b =10

        */

        // Logic 2  using + and -  without using 3rd variable

       /* a = a+b; // a=30
        b = a-b; // b=10
        a = a-b; // a=20

        */

        // Logic 3  using * and /  without using 3rd variable

      /*  a = a*b;  // a=200
        b = a/b;   //b = 10
        a = a/b;   // a = 20

       */

        // Logic 4  using bitwise operator XOR (^)

     /*   a =10;  // 1010
        b = 20; // 10100
        a = a^b; // 30 = 11110
        b = a^b;
        a = a^b;
      */
        // Logic 5  using single statement

        b = a+b -(a=b);

        System.out.println("After Swapping : a = " +a+ " b= " +b);
    }
}
