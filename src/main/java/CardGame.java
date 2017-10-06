
public class CardGame {

	public String play(char[] p1Cards, char[] p2Cards) {
		int p1Wins = 0;
		int p2Wins = 0;
		for (int i = 0; i < p2Cards.length; i++) {
			int p1Card = valueOf(p1Cards[i]);
			int p2Card = valueOf(p2Cards[i]);
			if (p1Card > p2Card)
				p1Wins++;
			if (p1Card < p2Card)
				p2Wins++;
		}
		return determineWinner(p1Wins, p2Wins);
	}

	private String determineWinner(int p1Wins, int p2Wins) {
		if (p1Wins > p2Wins)
			return "p1 wins " + p1Wins + " to " + p2Wins;
		if (p1Wins < p2Wins)
			return "p2 wins " + p2Wins + " to " + p1Wins;
		return "draw";
	}

	private int valueOf(char c) {
		return new String(new char[] { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' }).indexOf(c);
	}
}
