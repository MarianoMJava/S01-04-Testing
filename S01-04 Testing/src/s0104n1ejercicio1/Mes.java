package s0104n1ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Mes {

	public static HashMap<Integer, String> cargaMes() {

		HashMap<Integer, String> mesesCargados = new HashMap<Integer, String>();

		FileReader archivo;
		BufferedReader lectura;

		try {

			archivo = new FileReader("C:\\Users\\of_tecnica1\\Desktop\\Meses.txt");
			lectura = new BufferedReader(archivo);
			String linea;

			while ((linea = lectura.readLine()) != null) {

				String[] separadorLinea = linea.split(" "); // Partimos la linea leida del archivo .txt

				int nroMes = Integer.parseInt(separadorLinea[0]); // Casteamos el String de numero de mes a entero y
																	// guardamos en variable nroMes
				String mes = separadorLinea[1]; // Cargamos en mes el mes leido

				mesesCargados.put(nroMes, mes); // Cargamos el HashMap con lo leido

			}

		} catch (IOException e) {

			System.out.println("No se realizo la carga con exito");

		}

		return mesesCargados;
	}

}
