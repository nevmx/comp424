package student_player;

import tablut.TablutBoardState;

public abstract class AbstractHeuristic {
	public abstract int getHeuristicValue(TablutBoardState previous, TablutBoardState current);
}
