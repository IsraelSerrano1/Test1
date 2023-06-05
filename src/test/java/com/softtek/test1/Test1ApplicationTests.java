package com.softtek.test1;

import com.softtek.test1.modelo.Calculadora;
import com.softtek.test1.modelo.Circulo;
import com.softtek.test1.modelo.Figura;
import com.softtek.test1.modelo.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {
	private Figura fig;
	private Circulo circulo;
	@BeforeEach
	public void antesCada() {
		fig = new Figura(3, 5);
		circulo = new Circulo(3, 5, 5.0);
}

	@Test
	@DisplayName("TestCalculadora")
	void testCalculadora() throws Exception {
		double resultadoSuma = Calculadora.sumar(2,2);
		Assertions.assertEquals(4,resultadoSuma);

		double resultadoResta = Calculadora.restar(8,4);
		Assertions.assertEquals(4,resultadoResta);

		double resultadoMultiplcar = Calculadora.multiplicar(2,5);
		Assertions.assertEquals(10, resultadoMultiplcar);

		double resultadoDivision = Calculadora.dividir(10,5);
		Assertions.assertEquals(2, resultadoDivision);

		Assertions.assertThrows(Exception.class, () -> {
			Calculadora.dividir(10.0, 0.0);
		});

	}

	@Test
	@DisplayName("Probando métodos de rectángulo")
	void testRectangulo(){
		double resultadoAreaRectangulo = Rectangulo.areaRectangulo(4,4);
		Assertions.assertEquals(16, resultadoAreaRectangulo);
	}
	@Test
	public void testPosicionCirculo() {
		String posicion = Circulo.posicion();
		Assertions.assertEquals("(3, 5)", posicion);
	}

	@Test
	@DisplayName("Probando métodos de circulo")
	void testCirculo(){
		double resultadoAreaCirculo = Circulo.areaCirculo(circulo.getRadio());
		Assertions.assertEquals(78.53981633974483,resultadoAreaCirculo);

	}

	@Test
	public void testGetCoordenadaX() {
		Assertions.assertEquals(3, Figura.getCoordenadaX());
	}

	@Test
	public void testSetCoordenadaX() {
		Figura.setCoordenadaX(8);
		int coordenadaX = Figura.getCoordenadaX();
		Assertions.assertEquals(8, coordenadaX);
	}

	@Test
	public void testGetCoordenadaY() {
		int coordenadaY = Figura.getCoordenadaY();
		Assertions.assertEquals(5, coordenadaY);
	}

	@Test
	public void testSetCoordenadaY() {
		Figura.setCoordenadaY(10);
		int coordenadaY = Figura.getCoordenadaY();
		Assertions.assertEquals(10, coordenadaY);
	}

	@Test
	public void testPosicion() {
		String posicion = Figura.posicion();
		Assertions.assertEquals("(3, 5)", posicion);
	}


}
