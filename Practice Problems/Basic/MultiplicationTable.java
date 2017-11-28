/*******************************************************************************
@Title: MultiplicationTable.java
@Purpose: Demonstrate basic arithmetic understanding
@Author: Mbianda Denestel
@Date: 11/26/17
@Version: 1.0
@Prompt: Write a Java program that takes a number as input and prints its
        multiplication table upto 10.
*******************************************************************************/

import java.util.*;

public class MultiplicationTable{
  public static void main(String[] args) {

    Scanner user_input = new Scanner(Sys.in);
    int[] solutions = new int[10];

      System.out.println("What is your number?");
      int userNum = user_input.nextInt();
      multiTable(userNum, solutions);
  }
  public static void multiTable(int x, int[] populate)
  {
    int a;
    for(int i = 0; i < populate.length; i++){
        a = x * i;
        populate[i] = a;
    }

    for(int element : populate){
      System.out.println(element);
    }
  }
}
