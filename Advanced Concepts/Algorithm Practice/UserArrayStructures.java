import java.util.*;

public class UserArrayStructures {

  private static ArrayList<Integer> theArray = new ArrayList<Integer>();

  public static void populateArray(){
    Scanner user_input = new Scanner(System.in);
    System.out.println("How large is your array going to be?");
    try {
      int size = user_input.nextInt();
      for(int i = 0; i < size; i++){

        theArray.add((int)(Math.random() * 10) + 10);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }

  }
  /*public void generateRandomArray(int size){

    for (int i = 0; i < size; i++) {

      theArray.add((int)(Math.random() * 10) + 10);
    }
  }*/

  public static void displayArray(){

    System.out.println("----------");
    for (int i = 0; i < theArray.size(); i++) {
      System.out.print("| " + i + " |");
      System.out.println(theArray.get(i) + " |");
    }
  }

  public static void checkForValue(){

	  Scanner user_input = new Scanner(System.in);
    System.out.println("What value are you checking for in your array?");
    double checkVal = user_input.nextDouble();
    findValue(checkVal);
  }

  public static void findValue(double value){
    try{
      for(int i=0; i < theArray.size(); i++){
        if(theArray.get(i) == value){
          System.out.println("Your value was found at index: " + i);
        }
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  public static char deleteOptions(){
    Scanner user_input = new Scanner(System.in);
    System.out.println("How would you like to delete from your array?");
    System.out.println("I: by index || V: by value");
    char option = user_input.next().charAt(0);
    try{
      if(option == 'I' || option == 'V'){
        return option;
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return'n';
   }

   public static void deleteFromArray(char deleteOption){

     Scanner user_input = new Scanner(System.in);
     int indexChoice;
     try{
       if(deleteOption == 'I'){
         System.out.println("What index are you deleting from?");
         indexChoice = user_input.nextInt();

         if(indexChoice < theArray.size()){
           for(int i = indexChoice; i < theArray.size()-1; i++){
             theArray.set(i, theArray.get(i+1));
           }
         }
       }
       else if(deleteOption == 'V'){
         System.out.println("What value do you want to delete from your array?");
         indexChoice = user_input.nextInt();
       }
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
  public static int menuBar(){
    Scanner user_input = new Scanner(System.in);
    while(true){
      System.out.println("Welcome to the user arrays program.");
      System.out.println("What would you like to do? Your options are: ");
      System.out.println("1. Populate an array.");
      System.out.println("2. Display my Array.");
      System.out.println("3. Check for a value in my array.");
      System.out.println("4. Delete a value in my array.");
      System.out.println("5. Add a value to my Array.");
      System.out.println("6. Get a value from my array.");
      System.out.println("0. To exit the program.");
      System.out.println("--------------------------------------------------");
      try{
        int choice = user_input.nextInt();
        if (choice == (int)choice) {
          return choice;
        }
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }

  }
  public static boolean continueChoice(){

    Scanner user_input = new Scanner(System.in);
    System.out.println("Do you want to continue this program?");
    System.out.println("Y: yes || N: no");
    String contin = user_input.nextLine();

    try{
        if(contin.equals("Y")){
          return true;
        }
        else if(contin.equals("N")){
          return false;
        }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }

  public static boolean runChoice(int choice){

    switch(choice){

      case 1:
          populateArray();
          return continueChoice();

      case 2:
          displayArray();
          return continueChoice();

      case 3:
          checkForValue();
          return continueChoice();

      case 4:
          displayArray();
          deleteFromArray(deleteOptions());
          return continueChoice();

      case 5:
      break;
      case 6:
      break;
      case 0:
          return false;
    }
    return false;
  }

  public static void main(String[] args) {

    boolean run = true;
    while(run){
      run = runChoice(menuBar());
    }
  }
}
