import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CardGameTest {
	private CardGame cardgame;

	private char[] hand(char... values) {
		return values;
	}

	@Before
	public void create() {
		cardgame = new CardGame();
	}
	
	@Test
	public void draw() throws Exception {
		assertEquals("draw", cardgame.play(hand('2'), hand('2')));
	}

	@Test
	public void faced_card() {
		assertEquals("p1 wins 1 to 0", cardgame.play(hand('J'), hand('T')));
	}
	
	@Test
	public void single_card() {
		assertEquals("p1 wins 1 to 0", cardgame.play(hand('3'), hand('2')));
		assertEquals("p2 wins 1 to 0", cardgame.play(hand('2'), hand('3')));
	}

	@Test
	public void multiple_cards() {
		assertEquals("p1 wins 2 to 0", cardgame.play(hand('3','3'), hand('2','2')));
		assertEquals("p1 wins 2 to 1", cardgame.play(hand('3','3','2'), hand('2','2','3')));
		assertEquals("p2 wins 2 to 1", cardgame.play(hand('2','2','3'), hand('3','3','2')));
	}
}
