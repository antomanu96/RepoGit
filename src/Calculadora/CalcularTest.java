package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

class CalcularTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumar() {
		//fail("Not yet implemented");
		System.out.println("Test de sumar");
		Calcular instance = new Calcular();
		float suma1 =instance.sumar(2, 3);
		float valor1=5;
		assertEquals(suma1, valor1);
		float suma2 =instance.sumar(-2, 3);
		float valor2=1;
		assertEquals(suma2, valor2);
	}

	@Test
	void testRestar() {
		//fail("Not yet implemented");
		System.out.println("Test de restar");
		Calcular instance = new Calcular();
		float resta1 =instance.restar(2, 3);
		float valor1=-1;
		assertEquals(resta1, valor1);
		float resta2 =instance.restar(3, 3);
		float valor2=0;
		assertEquals(resta2, valor2);
		
	}

	@Test
	void testMultiplicar() {
		//fail("Not yet implemented");
		System.out.println("Test de multiplicar");
		Calcular instance = new Calcular();
		float producto1 =instance.multiplicar(2, 3);
		float valor1=6;
		assertEquals(producto1, valor1);
		float producto2 =instance.multiplicar(3, 3);
		float valor2=9;
		assertEquals(producto2, valor2);
	}

	@Test
	void testDividir() {
		//fail("Not yet implemented");
		System.out.println("Test de dividir");
		Calcular instance = new Calcular();
		float division1 =instance.dividir(6, 2);
		float valor1=3;
		assertEquals(division1, valor1);
		float producto2 =instance.dividir(3, 3);
		float valor2=1;
		assertEquals(producto2, valor2);
		
		try {
			//float producto3 =
			instance.dividir(3, 0);
			//float valor3=Float.POSITIVE_INFINITY;
			//assertEquals(producto3, valor3);
		} catch (ArithmeticException ex) {
			System.out.println("ERROR AL DIVIDIR POR 0");
		} 
		
	}

	@Test
	void testIsPrimo() {
		//fail("Not yet implemented");
		System.out.println("Test de esPrimo");
		Calcular instance = new Calcular();
		boolean primo1 =instance.isPrimo(2);
		boolean valor1=true;
		assertEquals(primo1, valor1);
		boolean primo2 =instance.isPrimo(15);
		boolean valor2=false;
		assertEquals(primo2, valor2);
	}

}
