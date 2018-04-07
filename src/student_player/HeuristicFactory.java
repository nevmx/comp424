package student_player;

import tablut.TablutBoardState;

public class HeuristicFactory {
	private static MuscoviteHeuristic mh;
	private static SwedishHeuristic sh;
	
	public static AbstractHeuristic getHeuristic(TablutBoardState board) {
		if (board.getTurnPlayer() == TablutBoardState.MUSCOVITE) {
			if (mh == null) {
				mh = new MuscoviteHeuristic();
			}
			return mh;
		}
		
		if (sh == null) {
			sh = new SwedishHeuristic();
		}
		return sh;
	}
}
