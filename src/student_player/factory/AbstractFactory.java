package student_player.factory;

import student_player.heuristics.AbstractHeuristic;

public abstract class AbstractFactory {
	public abstract AbstractHeuristic createHeuristic();
}
