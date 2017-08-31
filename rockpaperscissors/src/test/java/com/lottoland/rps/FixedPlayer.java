package com.lottoland.rps;

import com.lottoland.rps.game.Move;

public class FixedPlayer implements Player {

	@Override
	public Move getMove() {
		return Move.ROCK;
	}

}
