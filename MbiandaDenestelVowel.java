/*******************************************************************
@Title: MbiandaDenestelVowel
@Purpose: To verify the edit, compile, execute function in Textpad
@Author: Mbianda Denestel
@Date: 2/27/17
@Version: 1.0
********************************************************************/





import java.util.*;

public class MbiandaDenestelVowel {


  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);

    System.out.println("what is your word?");
    String word = user_input.next();

  int count = 0;

  for (int i = 0; i<word.length(); i++){

    switch (word.charAt(i)) {

      case 'a':
      count++;
      break;
      case 'e':
      count++;
      break;
      case 'i':
      count++;
      break;
      case 'o':
      count++;
      break;
      case 'u':
      count++;
      break;


    }
    System.out.println("There are " + count + " vowels in your name");
  }
  }
}
