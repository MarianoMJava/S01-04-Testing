package s0104n1ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class S0104N1Ejercicio3Test {

	@Test
	void testArrayIndexOutOfBoundsException() {

		ArrayList<Integer> arrayTest = new ArrayList<Integer>();

		arrayTest.add(15);
		arrayTest.add(14);
		arrayTest.add(13);
		arrayTest.add(12);

		ArrayList<Integer> arrayTestExpected = new ArrayList<Integer>();

		arrayTestExpected.add(29);
		arrayTestExpected.add(27);
		arrayTestExpected.add(25);

		for (int i = 0; i < arrayTestExpected.size(); i++) {

			assertEquals(arrayTestExpected.get(i), S0104N1Ejercicio3.sumaSubsecuentes(arrayTest).get(i));

		}
	}

}

//LUEGO DE CORRER EL TEST SE VERIFICA QUE EL PROGRAMA NO FUNCIONA CORRECTAMENTE Y QUE GENERA UN ARRAYINDEXOUTOFBOUNDSEXCEPTION().
