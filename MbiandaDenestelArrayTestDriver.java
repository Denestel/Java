/***********************************************************************
@Title: MbiandaDenestelArrayTestDriver.java
@Purpose: To get familiar with class, array, and their usage
@Author: Mbianda Denestel
@Date: 4/6/17
@Version: 1.0
************************************************************************/

import java.util.*;

public class MbiandaDenestelArrayTestDriver {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    JavaArray moldArray = new JavaArray();

    System.out.println("How big is your array?");
    int arraySize = user_input.nextInt();

    double[] user_array = new double[arraySize];

    System.out.println("What are the " + arraySize + " numbers in your array?");

    for (int i = 0; i < arraySize; i++) {

      int arrayElements = user_input.nextInt();
      user_array[i] = arrayElements;

    }

    moldArray.setArray(user_array);

    if (moldArray.isInIncreasingOrder() == true) {

      System.out.println("Your array is in increasing order!");

    }
    else if (moldArray.isInDecreasingOrder() == true) {

      System.out.println("Your array is in decreasing order!");

    }
    else {

      System.out.println("Your array has no order!");
    }

    double high = moldArray.getHighest();
    double low = moldArray.getLowest();
    double total = moldArray.getTotal();
    double average = moldArray.getAverage();

    System.out.println("The highest number in your array is " + high);
    System.out.println("The lowest value in your array is " + low);
    System.out.println("The total value of your array is " + total);
    System.out.println("The average value of your array is " + average);


  }
}
