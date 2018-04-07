package student_player.factory;

import student_player.heuristics.AbstractHeuristic;
import student_player.heuristics.MuscoviteHeuristic;

public class MuscoviteFactory extends AbstractFactory {
	
	private MuscoviteHeuristic mh;

	@Override
	public AbstractHeuristic createHeuristic() {
		if (mh == null) {
			mh = new MuscoviteHeuristic();
		}
		return mh;
	}

}
