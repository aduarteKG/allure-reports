/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.secondproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import io.qameta.allure.Allure;

@Tag("fast")
class FirstTest {
	@Test
	@DisplayName("Substraction")
	void substraction(TestInfo testInfo) {
		// https://github.com/allure-framework/allure-java/issues/1028
		Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

        Allure.label("parentSuite", "API");

		Calculator calculator = new Calculator();
		assertEquals(0, calculator.substract(1, 1), "1 - 1 should equal 0");
		
	}

	@Test
	@DisplayName("Multiply")
	void multiply(TestInfo testInfo) {
		// https://github.com/allure-framework/allure-java/issues/1028
		Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

        Allure.label("parentSuite", "API");

		Calculator calculator = new Calculator();
		assertEquals(1, calculator.multiply(1, 1), "1 * 1 should equal 1");
	}
}
