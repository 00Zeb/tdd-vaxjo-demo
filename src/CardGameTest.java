import static org.junit.Assert.*;

import org.junit.Test;

public class CardGameTest {

	@Test
	public void draw() throws Exception {
		CardGame cardgame = new CardGame();
		assertEquals("draw", cardgame.play(new char[]{'2'}, new char[] {'2'}));
	}

	@Test
	public void single_card() {
		CardGame cardgame = new CardGame();
		assertEquals("p1 wins 1 to 0", cardgame.play(new char[]{'3'}, new char[] {'2'}));
	}
}
