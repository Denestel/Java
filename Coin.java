/**
@Title:		MbiandaDenestelCoin
@Purpose:	To practice random class and objects.
@Author:    Mbianda Denestel
@Date:   	3/29/17
@Version:	1.0
*/
import java.util.Random;

public class Coin {
	private String sideUp;

	//Here we initiaize and toss the coin
	public Coin() {
		toss();
	} //end Coin Constructor

	//Here we find out what side is facing up
	public String getSideUp() {
		return sideUp;
	}//end getSideUp

	//here we toss the coin
	public void toss() {
		Random rand = new Random();
		if(rand.nextInt() %2 == 0) {
			sideUp = "heads";
		}
		else {
			sideUp = "tails";
		}
	}//end toss method
}//end Coin class
