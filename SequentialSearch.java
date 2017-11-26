public class SequentialSearch {
  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    boolean answer = SequentialSearchAlgorithm(array, 5);
    System.out.println(answer);

    int[] array1 = {133, 245, 343, 434, 577, 635, 798, 876, 943, 210};
    answer = SequentialSearchAlgorithm(array1, 343);
    System.out.println(answer);

    int[] array2 = {145, 2876, 3453, 433, 52, 76, 788, 8345, 944, 3410};
    answer = SequentialSearchAlgorithm(array2, 76);
    System.out.println(answer);


  }

  public static boolean SequentialSearchAlgorithm(int[] a, int search) {

    //if the search value is found, then lets return true
    //otherwise, return false
    boolean result = false;
    //we want to acess each element of the array a
    //condition: when using <=, i <= last index number
    //         : when using <, i < size
    for(int i = 0; i < a.length; i++) {

      //if a[i] is equal to search value
      //then update result to true
      if (a[i] == search) {

        //then the result will be true
        result = true;
        break;

      }

    } //end of loop

    return result;
  }
}
