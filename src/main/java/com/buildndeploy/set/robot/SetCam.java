package com.buildndeploy.set.robot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.buildndeploy.set.Card;
import com.buildndeploy.set.Deck;

import topcodes.TopCode;

public class SetCam {
	static TopCode[] validCodes;
	static HashMap<Integer, Integer> codeToCardNumberMap;
	static List<Card> cards;
	
	static {
		cards = new Deck().getCards();
		
		validCodes = TopCode.generateCodes();
		codeToCardNumberMap = new HashMap<Integer, Integer>(99);
		for (int i = 0; i < validCodes.length; i++) {
			codeToCardNumberMap.put(validCodes[i].getCode(), i);
		}	
	}
	
	public static int getCodeCardNumber(TopCode topCode) {		
		return codeToCardNumberMap.get(topCode.getCode());
	}

	public static Card getCodeCard(TopCode topCode) {
		return cards.get(getCodeCardNumber(topCode));
	}

	public static PhysicalCard getPhysicalCardFromTopCode(TopCode topCode) {
		return new PhysicalCard(getCodeCard(topCode), (int) topCode.getCenterX(), (int) topCode.getCenterY());
	}

	public static List<PhysicalCard> getPhysicalCardsFromTopCodes(List<TopCode> topCodes) {
		List<PhysicalCard> physicalCards = new ArrayList<PhysicalCard>();

		for (TopCode topCode: topCodes) {
			PhysicalCard physicalCard = getPhysicalCardFromTopCode(topCode);
			physicalCards.add(physicalCard);
		}
		
		return physicalCards;
	}
}
