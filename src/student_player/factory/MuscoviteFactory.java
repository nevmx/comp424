package student_player.factory;

import student_player.heuristics.AbstractHeuristic;
import student_player.heuristics.MuscoviteHeuristic;

public class MuscoviteFactory extends AbstractFactory {
	
	private MuscoviteHeuristic mh;

	@Override
	/**
	 * Constructs the Muscovite heuristic function.
	 * @return Muscovite heuristic function
	 */
	public AbstractHeuristic createHeuristic() {
		if (mh == null) {
			mh = new MuscoviteHeuristic();
		}
		return mh;
	}

}
