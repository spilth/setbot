package com.buildndeploy.set.robot;

import java.util.HashMap;

import topcodes.TopCode;

public class SetCam {
	static TopCode[] validCodes;
	static HashMap<Integer, Integer> cardCodeMap;
	
	static {
		validCodes = TopCode.generateCodes();
		cardCodeMap = new HashMap<Integer, Integer>(99);
		for (int i = 0; i < validCodes.length; i++) {
			cardCodeMap.put(validCodes[i].getCode(), i + 1);
		}	
	}
	
	public static int getCodeCardNumber(int code) {		
		return cardCodeMap.get(code);
	}
}
