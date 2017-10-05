import static org.junit.Assert.*;

import org.junit.Test;

public class CardGameTest {

	@Test
	public void draw() throws Exception {
		CardGame cardgame = new CardGame();
		assertEquals("draw", cardgame.play(new char[]{'2'}, new char[] {'2'}));
	}
}
