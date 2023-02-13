package s0104n1ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class S0104N1Ejercicio2Test {

	@Test
	void testLetrasCorrectas() {
		
		HashMap<Integer, Character> tablaLetrasTest = new HashMap<Integer, Character>();
		
		FileReader archivoTest;
		BufferedReader lectorTest;
		
		try {
			
		archivoTest = new FileReader("C:\\Users\\of_tecnica1\\Desktop\\DnisPTest.txt");
		lectorTest = new BufferedReader(archivoTest);
		String linea;
		
		while ((linea = lectorTest.readLine())!=null) {
			
			String[] lineaPartTest = linea.split(" ");
			
			int nroDniTest = Integer.parseInt(lineaPartTest[0]);
			char letraDniTest = lineaPartTest[1].charAt(0);
			
			tablaLetrasTest.put(nroDniTest, letraDniTest);
			
		}	
		
		}catch (IOException e) {
			
			System.out.println("La carga del archivo de test no se cargo correctamente!");
			
		}
		
		for(int i : tablaLetrasTest.keySet()) {
			
			int resto;
			
			resto=i%23;
			
			//System.out.println(i);
			
			assertEquals(tablaLetrasTest.get(i) , CalculoDni.calculaLetraDni(resto));
			
		}
		
	}

}
