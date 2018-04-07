package student_player.factory;

import student_player.heuristics.AbstractHeuristic;
import student_player.heuristics.SwedishHeuristic;

public class SwedishFactory extends AbstractFactory {
	
	private SwedishHeuristic sh;

	@Override
	/**
	 * Constructs the Swedish heuristic function.
	 * @return Swedish heuristic function
	 */
	public AbstractHeuristic createHeuristic() {
		if (sh == null) {
			sh = new SwedishHeuristic();
		}
		return sh;
	}

}
