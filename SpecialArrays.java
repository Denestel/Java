import java.util.*;


public class SpecialArrays {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    String[] months = {"January", "Feburary", "March", "April", "May", "June", "July", "August"};

    // loops through the months array to access each element
    for (int i = 0; i < months.length; i++) {

      //loops through each element at the corresponding index
      for (int x = 0; x < months[i].length(); i++) {

        //assigns the length of each element at index i to an integer variable
        int monthLength = months[i].length();

        //assigns the char found at the end of each element at index i to find
        char find = months[i].charAt(monthLength-1);

        System.out.println(find);


      }

    }


  }
}
