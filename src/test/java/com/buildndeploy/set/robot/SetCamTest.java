package com.buildndeploy.set.robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetCamTest {

	@Test
	public void codeMapsToCardNumber() {
		assertEquals(1, SetCam.getCodeCardNumber(31));
		assertEquals(2, SetCam.getCodeCardNumber(47));
	}

}
