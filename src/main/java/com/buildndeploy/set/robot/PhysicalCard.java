package com.buildndeploy.set.robot;

import com.buildndeploy.set.Card;

public class PhysicalCard {
	Card card;
	int x;
	int y;
	
	public PhysicalCard(Card card, int x, int y) {
		this.card = card;
		this.x = x;
		this.y = y;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhysicalCard other = (PhysicalCard) obj;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
