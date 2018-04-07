package student_player.heuristics;

import coordinates.Coord;
import coordinates.Coordinates;
import tablut.TablutBoardState;

public class SwedishHeuristic extends AbstractHeuristic {

	@Override
	public int getHeuristicValue(TablutBoardState previous, TablutBoardState current) {
		int opponentPlayerDelta = current.getNumberPlayerPieces(previous.getOpponent())
				- previous.getNumberPlayerPieces(previous.getOpponent());
		
    	Coord kingCoord = current.getKingPosition();
    	return Coordinates.distanceToClosestCorner(kingCoord) + opponentPlayerDelta;
	}

}
