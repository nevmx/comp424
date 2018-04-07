package student_player;

import java.util.List;
import java.util.Random;

import boardgame.Move;
import tablut.TablutBoardState;
import tablut.TablutMove;
import tablut.TablutPlayer;

/** A player file submitted by a student. */
public class StudentPlayer extends TablutPlayer {

    /**
     * You must modify this constructor to return your student number. This is
     * important, because this is what the code that runs the competition uses to
     * associate you with your agent. The constructor should do nothing else.
     */
    public StudentPlayer() {
        super("260621662");
    }

    /**
     * This is the primary method that you need to implement. The ``boardState``
     * object contains the current state of the game, which your agent must use to
     * make decisions.
     */
    public Move chooseMove(TablutBoardState bs) {
    	// Get heuristic function object
    	AbstractHeuristic h = HeuristicFactory.getHeuristic(bs);
    	
    	// Get all current legal moves
    	List<TablutMove> options = bs.getAllLegalMoves();
    	
    	// Clone board state to process potential moves
    	TablutBoardState clonedBs = (TablutBoardState) bs.clone();
    	
    	// Start with a random move
    	Random r = new Random();
    	Move bestMove = options.get(r.nextInt(options.size()));
    	clonedBs.processMove((TablutMove) bestMove);
    	int minHeuristic = h.getHeuristicValue(bs, clonedBs);
    	
    	// Iterate over all options
    	for (TablutMove m : options) {
    		// Evaluate this option with the heuristic function
    		// Choose the option that minimizes heuristic function
    		clonedBs = (TablutBoardState) bs.clone();
    		clonedBs.processMove(m);
    		
    		int heuristic = h.getHeuristicValue(bs, clonedBs);
    		if (heuristic < minHeuristic) {
    			minHeuristic = heuristic;
    			bestMove = m;
    		}
    	}
    	
        return bestMove;
    }
}