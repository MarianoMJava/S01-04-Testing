package s0104n1ejercicio1;

import java.util.HashMap;

public class S0104N1Ejercicio1 {

	public static void main(String[] args) {

		HashMap<Integer, String> meses = new HashMap<Integer, String>();

		meses = Mes.cargaMes();

		System.out.println(meses);

	}

}
