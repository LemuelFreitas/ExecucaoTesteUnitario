package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5 = 10")
	void TestSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 + 5 não gerou o valor 10");
	}
	@Test
	@DisplayName(" Teste 6 - 6 = 0")
	void TestSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 6D;
		double esperado = 0D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 6 - 6.2 não gerou o valor -0.8");
	}
	@Test
	@DisplayName(" Teste 2 * 2 = 4")
	void TestMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 2D;
		double valor2 = 2D;
		double esperado = 4D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 2 * 2 não gerou o valor 4");
	}
	@Test
	@DisplayName(" Teste 10 / 5 = 2")
	void TestDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 5D;
		double esperado = 2D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 10 / 5 não gerou o valor 2");
	}

}

