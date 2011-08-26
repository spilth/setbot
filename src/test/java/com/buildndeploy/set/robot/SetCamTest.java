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
	List<PhysicalCard> physicalCards;

	@Before
	public void setup() {
		cards = new Deck().getCards();

		firstCard = cards.get(0);
		secondCard = cards.get(1);
		thirdCard = cards.get(2);
		lastCard = cards.get(80);

		firstPhysicalCard = new PhysicalCard(firstCard, 42, 42);
		secondPhysicalCard = new PhysicalCard(secondCard, 64, 64);

		topCodeA = new TopCode(31);
		topCodeA.setLocation(42.0f, 42.0f);

		topCodeB = new TopCode(47);
		topCodeB.setLocation(64.0f, 64.0f);

		topCodes = new ArrayList<TopCode>();
		topCodes.add(topCodeA);
		topCodes.add(topCodeB);
		
		physicalCards = new ArrayList<PhysicalCard>();
		physicalCards.add(firstPhysicalCard);
		physicalCards.add(secondPhysicalCard);
	}
	
	@Test
	public void codeMapsToCardNumber() {
		assertEquals(0, SetCam.getCodeCardNumber(topCodeA));
		assertEquals(1, SetCam.getCodeCardNumber(topCodeB));
	}

	@Test
	public void codeMapsToCard() {
		assertEquals(firstCard, SetCam.getCodeCard(topCodeA));
		assertEquals(secondCard, SetCam.getCodeCard(topCodeB));
	}

	@Test
	public void physicalCardFromTopCode() {
		assertEquals(firstPhysicalCard, SetCam.getPhysicalCardFromTopCode(topCodeA));
		assertEquals(secondPhysicalCard, SetCam.getPhysicalCardFromTopCode(topCodeB));
	}

	@Test
	public void physicalCardsFromListOfTopCodes() {
		List<PhysicalCard> list = SetCam.getPhysicalCardsFromTopCodes(topCodes);
		assertArrayEquals(physicalCards.toArray(), list.toArray());
	}

}
