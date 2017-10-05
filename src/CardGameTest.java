import static org.junit.Assert.*;

import org.junit.Test;

public class CardGameTest {
	private char[] hand(char... values) {
		return values;
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

	@Test
	public void multiple_cards() {
		CardGame cardgame = new CardGame();
		assertEquals("p1 wins 2 to 0", cardgame.play(hand('3','3'), hand('2','2')));
		assertEquals("p1 wins 2 to 1", cardgame.play(hand('3','3','2'), hand('2','2','3')));
		assertEquals("p2 wins 2 to 1", cardgame.play(hand('2','2','3'), hand('3','3','2')));
	}
}
