/***********************************************************************
@Title: FinalArrayTestDriver.java
@Purpose: To get familiar with class, array, and their usage
@Author: Mbianda Denestel
@Date: 11/25/17
@Version: 2.0
************************************************************************/

import java.util.*;

public class MbiandaDenestelArrayTestDriver {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    JavaArray myArray = new JavaArray();

    System.out.println("How big is your array?");
    int arraySize = user_input.nextInt();

    double[] user_array = new double[arraySize];

    System.out.println("What are the " + arraySize + " numbers in your array?");

    for (int i = 0; i < arraySize; i++) {

      int arrayElements = user_input.nextInt();
      user_array[i] = arrayElements;
    }

    myArray.setArray(user_array);

    System.out.println("What would you like to do with your array?");
    boolean control = true;

    while(control){

      System.out.println("------------Your options are---------------");
      System.out.println("1. Is my array in increasing order?");
      System.out.println("2. Is my array in decreasing order?");
      System.out.println("3. What is the highest value in my array?");
      System.out.println("4. What is the lowest value in my array?");
      System.out.println("5. What is the Total of my array?");
      System.out.println("6. What is the average of my array?");
      System.out.println("7. What is the Median value of my array?");
      System.out.println("8. What is the Mode of my array?");
      System.out.println("9. What is the Range of my array?");
      System.out.println("10. What is in my array?");
      System.out.println("0. TO EXIT");
      int userChoice = user_input.nextInt();

      if(userChoice == 0) {
        control = false;
      }
      else{
        switch (userChoice) {

          case 1:
              if (myArray.isInIncreasingOrder() == true)
              {
                System.out.println("Your array is in increasing order!");
                }
              else
              {
                System.out.println("Your array is not in increasing order!");
                }
            break;
          case 2:
              if (myArray.isInDecreasingOrder() == true)
              {
                System.out.println("Your array is in decreasing order!");
                }
              else
              {
                System.out.println("Your array is not in increasing order!");
                }
            break;
          case 3:
              System.out.println("The highest number in your array is " + myArray.getHighest());
            break;
          case 4:
              System.out.println("The lowest value in your array is " + myArray.getLowest());
            break;
          case 5:
              System.out.println("The total value of your array is " + myArray.getTotal());
            break;
          case 6:
              System.out.println("The average value of your array is " + myArray.getAverage());
            break;
          case 7:
            break;
          case 8:
              System.out.println("The Mode of your array is " + myArray.getMode());
            break;
          case 9:
            break;
          case 10:
              myArray.inIt();
            break;
          default:
            break;
        }
      }

    }
  }
}
