package com.careerdevs;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int age = 30;
//           age = 35;
       // int myAge= 30;
        //int herAge = myAge;
        //System.out.println(herAge);

        /* Primitive types are used for storing simple values
        Reference is used for storing complex objects
         under primitive we have
         byte  1
         short  2
         int  4
         long  8
         float  4
         double 8
         char  2
           all words in orange are reserved key word in java
        * */
        //byte age = 30;
        //long viewCount = 3_123_456_789L;
        //float price = 10.99F;
        //char letter = 'A';
        //boolean isEligible = false;
      // System.out.println(isEligible);

        //byte x = 1;
        //byte y = x;
        //x = 2;
        //System.out.println(y)

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // reference types are copied by their references while
        // primitives are copied by their values

    }
}
