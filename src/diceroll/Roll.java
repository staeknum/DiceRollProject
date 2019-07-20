package diceroll;
/**
 *
 * @author W010_NP00762AL
 * Rolling Dice Method
 *
 */

public class Roll implements DiceRoll {

	public byte roll() {
		return 0;
	}

	public int rollingForQty(int dot) {

		int six =  (int)((Math.random() * dot) + 1);

		return six;

	}

}
