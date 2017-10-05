
public class CardGame {

	public String play(char[] cs, char[] cs2) {
		int p1Wins = 0;
		int p2Wins = 0;
		for (int i = 0; i < cs2.length; i++) {
			if(cs[i] > cs2[i])
				p1Wins++;
			if(cs[i] < cs2[i])
				p2Wins++;
		}
		
		if(p1Wins > p2Wins)
			return "p1 wins " + p1Wins + " to " + p2Wins;
		if(p1Wins < p2Wins)
			return "p2 wins " + p2Wins + " to " + p1Wins;
		return "draw";
	}

}
