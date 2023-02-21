package s0104n1ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class S0104N1Ejercicio2Test {

	@ParameterizedTest
	@MethodSource("dnisCorrectosTest")
	
	void letraDni(char letra, int numero) {

		assertEquals(letra, CalculoDni.calculaLetraDni(numero));

	}

	private static Stream<Arguments> dnisCorrectosTest() {
		return Stream.of(
				Arguments.of('Z', 12345678), 
				Arguments.of('N', 23561258), 
				Arguments.of('B', 85692123),
				Arguments.of('R', 52859636),
				Arguments.of('B', 94362571), 
				Arguments.of('Y', 2158763), 
				Arguments.of('B', 30215479), 
				Arguments.of('C', 86172395),
				Arguments.of('Y', 20003658), 
				Arguments.of('X', 20001569)
				);

	}
}
