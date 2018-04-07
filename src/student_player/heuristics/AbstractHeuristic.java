package student_player.heuristics;

import tablut.TablutBoardState;

public abstract class AbstractHeuristic {
	/**
	 * This method will compute the heuristic value of a given board state.
	 * This method will be implemented for every specific implementation of
	 * the heuristic function, in other words one for each side of the game.
	 * @param previous Previous board state.
	 * @param current Current board state.
	 * @return Heuristic value of the board state.
	 */
	public abstract int getHeuristicValue(TablutBoardState previous, TablutBoardState current);
}
