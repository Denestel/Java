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

      System.out.println("What is your number for your times table?");
      int userNum = user_input.nextInt();

      timesTable(userNum);

  }
  public static void timesTable(int userNum){

    int[] tableArray = multiplyInt(userNum);
    for(int i = 0; i < tableArray.length; i++){
      System.out.println(userNum + " * " + i + " = " + tableArray[i]);
    }
  }

  public static int[] multiplyInt(int x)
  {
    int[] populate = new int[10];
    for(int i = 0; i< populate.length; i++){
      int a = x * i;
      populate[i] = a;
    }
    return populate;
  }
}
