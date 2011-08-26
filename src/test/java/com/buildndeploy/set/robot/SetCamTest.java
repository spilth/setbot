package com.buildndeploy.set.robot;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import topcodes.TopCode;

import com.buildndeploy.set.Card;
import com.buildndeploy.set.Deck;

public class SetCamTest {
	List<Card> cards;
	Card firstCard, secondCard, thirdCard, lastCard;
	PhysicalCard firstPhysicalCard, secondPhysicalCard, thirdPhysicalCard, lastPhysicalCard;
	TopCode topCodeA, topCodeB;
	List<TopCode> topCodes;

	@Before
	public void setup() {
		cards = new Deck().getCards();

		firstCard = cards.get(0);
		secondCard = cards.get(1);
		secondCard = cards.get(2);
		lastCard = cards.get(80);

		firstPhysicalCard = new PhysicalCard(firstCard, 42, 42);
		secondPhysicalCard = new PhysicalCard(secondCard, 64, 64);

		topCodeA = new TopCode(31);
		topCodeA.setLocation(42.0f, 42.0f);

		topCodeB = new TopCode(31);
		topCodeB.setLocation(64.0f, 64.0f);

		topCodes = new ArrayList<TopCode>();
		topCodes.add(topCodeA);
		topCodes.add(topCodeB);
	}
	
	@Test
	public void codeMapsToCardNumber() {
		assertEquals(0, SetCam.getCodeCardNumber(31));
		assertEquals(1, SetCam.getCodeCardNumber(47));
	}

	@Test
	public void codeMapsToCard() {
		assertEquals(firstCard, SetCam.getCodeCard(31));
	}

	@Test
	public void physicalCardFromTopCode() {
		PhysicalCard physicalCard = new PhysicalCard(firstCard, 42, 42);

		assertEquals(physicalCard, SetCam.getPhysicalCardFromTopCode(topCodeA));
	}

}
