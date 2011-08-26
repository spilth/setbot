package com.buildndeploy.set.robot;

import java.util.HashMap;

import topcodes.TopCode;

public class SetCam {

	public static Object getCodeCardNumber(int code) {
		TopCode[] validCodes = TopCode.generateCodes();
		HashMap<Integer, Integer> cardCodeMap = new HashMap<Integer, Integer>(99);
		for (int i = 0; i < validCodes.length; i++) {
			cardCodeMap.put(validCodes[i].getCode(), i + 1);
		}
		
		return cardCodeMap.get(code);
	}

}
