package student_player.factory;

import student_player.heuristics.AbstractHeuristic;
import student_player.heuristics.SwedishHeuristic;

public class SwedishFactory extends AbstractFactory {
	
	private SwedishHeuristic sh;

	@Override
	public AbstractHeuristic createHeuristic() {
		if (sh == null) {
			sh = new SwedishHeuristic();
		}
		return sh;
	}

}
