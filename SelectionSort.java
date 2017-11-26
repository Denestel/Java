import java.util.*;

public class SelectionSort {
  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    int[] numbers, sortedNumbers;

    numbers = new int[10];
    int populate;


    System.out.println("Please enter 11 numbers");
    for (int i = 0; i < numbers.length; i++) {

      populate = user_input.nextInt();

      numbers[i] = populate;
    }

    System.out.println("This is your array");

    for (int i = 0; i < numbers.length; i++) {

      System.out.println(numbers[i]);

    }

    selectionSort(numbers);


  }
  public static void selectionSort(int[] array) {

    int startScan, index, minIndex, minValue;

    for (startScan = 0; startScan < (array.length-1); startScan++) {

      minIndex = startScan;
      minValue = array[startScan];

      for (index = startScan + 1; index < array.length; index++) {

        if (array[index] < minValue) {

          minValue = array[index];
          minIndex = index;
        }
        array[minIndex] = array[startScan];
        array[startScan] = minValue;
      }

    }

    System.out.println("This is your sorted array using Selection Sort");

    for (int j = 0; j < array.length; j++) {

      System.out.println(array[j]);

    }
  }
}
