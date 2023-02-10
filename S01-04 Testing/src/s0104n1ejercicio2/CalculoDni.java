package s0104n1ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CalculoDni {

	public static char calculaLetraDni(int resto) {
		
		char letra;
		
		HashMap<Integer, Character> tablaLetras = new HashMap<Integer, Character>();
		
		FileReader archivo;
		BufferedReader lector; 
		
		try {
			
			archivo = new FileReader("C:\\Users\\of_tecnica1\\Desktop\\LetrasDNI.txt");
			lector = new BufferedReader(archivo);
			String linea ; 
			
			
			while((linea = lector.readLine())!= null) {
			
			String lineaPart[] = linea.split(" ");
			
			int numeroResto = Integer.parseInt(lineaPart[0]);
			char letraDni = lineaPart[1].charAt(0);
			
			tablaLetras.put(numeroResto, letraDni);
			
			}
			
			
		}catch(IOException e) {
			
			System.out.println("La carga del archivo no se ha realizado correctamente!");
			
		}
		
		
		letra = tablaLetras.get(resto);
		
		return letra;
	}
	
	
}
