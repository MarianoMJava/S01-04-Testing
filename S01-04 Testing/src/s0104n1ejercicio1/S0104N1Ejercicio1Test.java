package s0104n1ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class S0104N1Ejercicio1Test {

	// HashMap<Integer, String> cargaMes

	@Test
	void testSize() {

		HashMap<Integer, String> mesesCargadosTest = new HashMap<Integer, String>();

		mesesCargadosTest = Mes.cargaMes();

		int size = mesesCargadosTest.size();

		assertEquals(12, size);

	}

	@Test
	void testNotNull() {

		HashMap<Integer, String> mesesCargadosTest = new HashMap<Integer, String>();

		mesesCargadosTest = Mes.cargaMes();

		int size = mesesCargadosTest.size();

		assertNotEquals(0, size);

	}

	@Test
	void testAgosto() {

		HashMap<Integer, String> mesesCargadosTest = new HashMap<Integer, String>();

		mesesCargadosTest = Mes.cargaMes();

		String mes8 = mesesCargadosTest.get(8);

		assertEquals(mes8, "Agosto");

	}

}
