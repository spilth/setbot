package com.buildndeploy.set.robot;

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
	
	public static int getCodeCardNumber(int code) {		
		return codeToCardNumberMap.get(code);
	}

	public static Object getCodeCard(int code) {
		return cards.get(getCodeCardNumber(code));
	}
}
