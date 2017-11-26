import java.util.*;

public class NumbersAndAmpers {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);


    System.out.println("What is your number?");
    int userNum = user_input.nextInt();

    for(int i = userNum; i >= 1; i--) {
		    for(int j = 1; j < i; j++) {
			       System.out.print(j);
		      }
			  for(int k = userNum; k >= i; k--) {
			       System.out.print("&");
			    }
			System.out.println();
		}
  }
}
