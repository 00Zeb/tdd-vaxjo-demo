import static org.junit.Assert.*;

import org.junit.Test;

public class CardGameTest {
	private char[] hand(char value) {
		return new char[] {value};
	}

	@Test
	public void draw() throws Exception {
		CardGame cardgame = new CardGame();
		assertEquals("draw", cardgame.play(hand('2'), hand('2')));
	}

	@Test
	public void single_card() {
		CardGame cardgame = new CardGame();
		assertEquals("p1 wins 1 to 0", cardgame.play(hand('3'), hand('2')));
		assertEquals("p2 wins 1 to 0", cardgame.play(hand('2'), hand('3')));
	}
}
