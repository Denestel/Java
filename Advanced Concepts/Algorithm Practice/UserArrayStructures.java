import java.util.*;

public class UserArrayStructures {

  private ArrayList<Integer> theArray = new ArrayList<Integer>();

  public void populateArray(){
    Scanner user_input = new Scanner(System.in);
    System.out.println("How large is your array going to be?");
    try {
      int size = user_input.nextInt();
      for(int i = 0; i < size; i++){

        theArray[i] = (int)(Math.random() * 10) + 10;
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }

  }
  public void generateRandomArray(int size){

    for (int i = 0; i < size; i++) {

      theArray.add((int)(Math.random() * 10) + 10);
    }
  }

  public void displayArray(){

    System.out.println("----------");
    for (int i = 0; i < arraySize; i++) {
      System.out.print("| " + i + " |");
      System.out.println(theArray[i] + " |");
    }
  }

  public static void main(String[] args) {
    theArray.populateArray();
  }
}
