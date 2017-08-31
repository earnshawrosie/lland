package com.lottoland.rps;

import java.util.Random;

import com.lottoland.rps.game.Move;

public class RandomPlayer implements Player {
	
	private final Random random = new Random();

	@Override
	public Move getMove() {
		return Move.values()[random.nextInt(Move.values().length)];
	}

}
