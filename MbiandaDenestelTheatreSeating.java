/**
@Title: MbiandaDenestelTheatreSeating
@Purpose: To practice Array
@Author: Mbianda Denestel
@Date: 5/1/17
@Version: 1.0
*/

import java.util.*;
public class MbiandaDenestelTheatreSeating {

  //private int[][] seating;

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    int[][] seating = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                       {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                       {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                       {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                       {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                       {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                       {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
                       {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
                       {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};


    System.out.println("Welcome to TicketBarn, we offer the best seats at the best price! \n\n");

    System.out.println("Would you like to select a seat by price or by seating? \n");
    System.out.println("Select 'P' for price or 'S' for seat.");
    char uChoice = user_input.next().charAt(0);

	   seatOrPrice(uChoice, seating);

  }

  public static void seatOrPrice(char choice, int[][] seating) {

    Scanner user_input = new Scanner(System.in);

    switch (choice) {

      case 'p' :
                System.out.println("What ticket price are you looking for? Your choices are $10, $20, $30, $40 and $50");
                int tPriceChoice = user_input.nextInt();

                int numRows = seating.length;
                int numCols = 10;
                int pricePoint;

                System.out.println("These are your seating options!");

                for ( int row = numRows-1; row >= 0; row--) {

                  for (int col = 0; col < numCols; col++) {
					               int rowNum = numRows-row;
                         pricePoint = seating[row][col];

                    if (tPriceChoice == pricePoint) {

                      System.out.printf("This is one of your seating choices, seat %d, %d \n", rowNum, col+1);

                    }

                  }

                }

                System.out.println("\n\n");
                System.out.println("Which seat do you choose? \n");
                System.out.println("What is the row?");
                int rowChoice = user_input.nextInt();

                System.out.println("What is the coloumn?");
                int colChoice = user_input.nextInt();

                System.out.printf("CONGRATULATIONS! you have purchased seat %d, %d" + " for $" + seating[rowChoice-1][colChoice-1] + " !", rowChoice, colChoice);
                seating[rowChoice-1][colChoice-1] = 0;

                break;

      case 's' :
               System.out.println("What is your seating choice? \n");

               int seatRow;
               int seatAsile;
               int seatNum;

               do {

               System.out.println("What row would you like to sit in?");
               seatRow = user_input.nextInt();

               System.out.println("What aisle in row " + seatRow + " would you like to sit in?");
               seatAsile = user_input.nextInt();

               seatNum = seating[seatRow][seatAsile];

               }
               while (seatNum == 0);


               int seatPrice = seatNum;

               System.out.printf("The price for that seat is $%d dollars \n\n", seatPrice);
               System.out.println("Would you like to purchase this seat? (YES: Y), (NO: N)");
               char yesOrNo = user_input.next().charAt(0);

               if (yesOrNo == 'y') {

                 System.out.printf("CONGRATULATIONS! you have purchased seat %d, %d for $%d! \n", seatRow, seatAsile, seatPrice);
                 seating[seatRow-1][seatAsile-1] = 0;

               }

               break;

       default :
               System.out.println("I'm sorry, but that option is not available");

               break;

    }


  }
}
