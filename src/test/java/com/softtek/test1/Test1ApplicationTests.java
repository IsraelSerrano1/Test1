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
	private Rectangulo rectangulo;
	@BeforeEach
	public void antesCada() {
		fig = new Figura(3, 5);
		circulo = new Circulo(3, 5, 5.0);
		rectangulo = new Rectangulo(3,5,4,6);
}

	@Test
	public void contextLoads() {
		// Esta prueba verifica que el contexto de la aplicación se cargue correctamente
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

		Assertions.assertThrows(Exception.class, () -> Calculadora.dividir(10.0, 0.0));

	}

	@Test
	@DisplayName("Probando métodos de rectángulo")
	void testRectangulo(){
		double resultadoAreaRectangulo = rectangulo.areaRectangulo(rectangulo.getAncho(), rectangulo.getAlto());
		String posicion = rectangulo.posicion();
		Assertions.assertEquals(24, resultadoAreaRectangulo);
		Assertions.assertEquals("(3, 5)", posicion);
	}


	@Test
	@DisplayName("Probando métodos de circulo")
	void testCirculo(){
		double resultadoAreaCirculo = circulo.areaCirculo(circulo.getRadio());
		String posicion = circulo.posicion();
		Assertions.assertEquals(78.53981633974483,resultadoAreaCirculo);
		Assertions.assertEquals("(3, 5)", posicion);
	}

	@Test
	@DisplayName("Probando métodos de figura")
	void testFigura(){
		fig.setCoordenadaX(8);
		int coordenadaX = fig.getCoordenadaX();
		Assertions.assertEquals(8, coordenadaX);
		fig.setCoordenadaY(10);
		int coordenadaY = fig.getCoordenadaY();
		Assertions.assertEquals(10, coordenadaY);
		String posicion = fig.posicion();
		Assertions.assertEquals("(8, 10)", posicion);

	}

}
