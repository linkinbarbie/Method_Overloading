package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7,0);
        calcFeetAndInchesToCentimeters(157);
       // double AnswerSc = calcFeetAndInchesToCentimeters(75);
      //  System.out.println(AnswerSc);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet >= 0) && (inches >= 0 && inches <= 12))
        {double ftAnswer = (feet *  12) * 2.54; //final calculator in cm -  no need to declare variables when you are dealing with literals
          ftAnswer += inches * 2.54;
            System.out.println( "feet " + feet + " inches " + inches + "," + " answer in cms " + ftAnswer);
          return ftAnswer ;}
        else {
            System.out.println("Invalid Ft or Inches");
           return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches >= 0 )
        {double feet =  (int)inches/12;
        double remainingInches = (int)inches % 12;
         return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        else
        {return -1;}

    }



    }
    //Method Overloading is a feature that allows to have more than one method with the same name so long
//as we use different  parameters
//Benefits of Method Overloading

//1. Improves code readability and reusability
//2. It is easier to remember one method name instead of multiple method names
//3. Achieves consistency in naming. One name for methods consistently used is println.
//4. Println can store a variety of data types because it is set up using method overloading
//5.
