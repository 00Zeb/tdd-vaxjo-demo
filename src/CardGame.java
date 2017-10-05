
public class CardGame {

	public String play(char[] cs, char[] cs2) {
		if(cs[0] > cs2[0])
			return "p1 wins 1 to 0";
		if(cs[0] < cs2[0])
			return "p2 wins 1 to 0";
		return "draw";
	}

}
