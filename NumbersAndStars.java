import java.util.*;

public class NumbersAndStars {
  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    System.out.println("What is your number?");
    int userNum = user_input.nextInt();

int num = 0;


for (int i = 1; i <= userNum; i++) {

	for(int j = 1; j <= i; j++) {
		System.out.print(j);
	}
	for(int x = userNum; x > i; x--){
  		System.out.print("*");
	}
		System.out.println("");
  }
}
}
