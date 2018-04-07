package student_player.heuristics;

import tablut.TablutBoardState;

public class MuscoviteHeuristic extends AbstractHeuristic {

	@Override
	public int getHeuristicValue(TablutBoardState previous, TablutBoardState current) {
		
		if (current.getKingPosition() == null) {
			System.out.println("*** King death detected.");
			return Integer.MIN_VALUE;
		}
		
		return current.getNumberPlayerPieces(previous.getOpponent()) - 
				previous.getNumberPlayerPieces(previous.getOpponent());
	}

}
