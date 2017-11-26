/**
@Title:		MbiandaDenestelCoinDriver
@Purpose:	To practice random class and objects.
@Author:    Mbianda Denestel
@Date:   	3/29/17
@Version:	1.0
*/

public class MbiandaDenestelCoinDriver {

	public static void main(String[] args) {
		//Create a coin object
		Coin coin = new Coin();

		int heads = 0,tails = 0;

		System.out.println("Initial side up:\t" + coin.getSideUp());

		//for loop to toss 40 times
		for(int i = 0; i < 40; i++){
			coin.Toss();
			System.out.println("Throw number  " + (i + 1) + " \t" + coin.getSideUp());
			if(coin.getSideUp().equals("heads")){
				heads++;
			}
			else {
				tails++;
			}
		}
		System.out.println("Number of heads:\t" + heads + "\nNumber of tails:\t" + tails);
	}
}
