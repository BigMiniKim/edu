package edu.kosmo.ex;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	private Set<Integer> lottoSet = new HashSet();

	public Lotto() {
		while (lottoset.size() != 6) {
			int randomNum = (int) (Math.random() * 45) + 1;
			lottoSet.add(randomNum);

		}
	}

	public Set<Integer> getLottoSet() {
		return lottoSet;
	}

	public void setLottoSet(Set<Integer>)
this.lottoSet = lottoSet;
}
}
