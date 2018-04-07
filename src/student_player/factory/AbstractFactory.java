package student_player.factory;

import student_player.heuristics.AbstractHeuristic;

public abstract class AbstractFactory {
	/**
	 * Subclasses implement this method which returns the concrete
	 * heuristic function.
	 * @return Concrete heuristic function
	 */
	public abstract AbstractHeuristic createHeuristic();
}
