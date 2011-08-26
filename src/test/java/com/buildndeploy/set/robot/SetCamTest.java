package com.buildndeploy.set.robot;

import static org.junit.Assert.*;

import org.junit.Test;

import com.buildndeploy.set.Deck;

public class SetCamTest {

	@Test
	public void codeMapsToCardNumber() {
		assertEquals(0, SetCam.getCodeCardNumber(31));
		assertEquals(1, SetCam.getCodeCardNumber(47));
	}

	@Test
	public void codeMapsToCard() {
		assertEquals(new Deck().getCards().get(0), SetCam.getCodeCard(31));
	}

}
