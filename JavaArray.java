/***********************************************************************
@Title: Array.java
@Purpose: To get familiar with class, array, and their usage
@Author: Mbianda Denestel
@Date: 4/6/17
@Version: 1.0
************************************************************************/
import java.util.*;

public class JavaArray {

  private double[] array;

  //create an empty double array
  public void setArray(double[] arr) {
    array = arr;
  }

  //check if the array is in increasing order
  public boolean isInIncreasingOrder() {

    for (int i = 0; i < array.length-1; i++) {

      if (array[i] > array[i+1]) {

        return false;
      }
    }//end for loop
    return true;
  }//end method isInIncreasingOrder

  //check if the array is in decreasing order
  public boolean isInDecreasingOrder() {

    for (int i = 0; i < array.length; i++) {

      if (array[i] < array[i+1]) {

        return false;

      }
    }//end for loop
    return true;
  }//end method isInDecreasingOrder

  //find the largest value in the array
  public double getHighest() {

    double highest = array[0];

    for (int i = 0; i < array.length; i++) {

      if (array[i] > highest) {

        highest = array[i];
      }
    }//end for loop
    return highest;
  }//end method getHighest

  //find the smallest value in the array
  public double getLowest() {

    double lowest = array[0];

    for (int i = 1; i < array.length; i++) {

      if (array[i] < lowest) {

        lowest = array[i];
      }
    }//end for loop
    return lowest;
  }// end method getLowest

  //get the total of all values in the array
  public double getTotal() {

    double total = 0.0;

    for (int i = 0; i < array.length; i++) {

      total = array[i] + total;
    }//end for loop
    return total;
  }//end method getTotal

  //get the contents of the array
  public void inIt(){
    for(double element: array){
      System.out.print(element + ", ");
    }
  }//end method inIt

  //get the average of the array
  public double getAverage() {

    double average = getTotal() / array.length;

    return average;
  }//end method getAverage

  //get the median of the Array
  public double getMedian(){
    Arrays.sort(array);

    if((array.length%2) != 0){
      return array[(array.length/2)-1];
    }
    else{
      return array[(array.length/2)]; //array[(array.length/2)-1];
    }
  }//end method getMedian

  //get the mode of the Array
  public double getMode(){
    double mode = array[0];
    double maxCount = 0;

    for(double element: array){
      double value = element;
      double count = 1;
      for(double element2: array){
        if (element2 == value) {
          count++;
        }
        if(count > maxCount){
          mode = value;
          maxCount = count;
        }
      }
    }
	return mode;
  }// end method getMode

  //get the range of the Array
  public double getRange(){
	return 0;
  }//end method getRange

  //get the array
  public double[] getArray() {

	return array;
}//end method getArray


}
